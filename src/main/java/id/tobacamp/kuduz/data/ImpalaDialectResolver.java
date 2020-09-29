package id.tobacamp.kuduz.data;

import org.springframework.data.jdbc.repository.config.DialectResolver;
import org.springframework.data.relational.core.dialect.Dialect;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.JdbcOperations;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Optional;

public class ImpalaDialectResolver implements DialectResolver.JdbcDialectProvider {

	@Override
	public Optional<Dialect> getDialect(JdbcOperations operations) {
		return Optional.ofNullable(
				operations.execute((ConnectionCallback<Dialect>) ImpalaDialectResolver::getDialect));
	}

	private static Dialect getDialect(Connection connection) throws SQLException  {
		DatabaseMetaData metaData = connection.getMetaData();
		String name = metaData.getDatabaseProductName().toLowerCase(Locale.ROOT);
//		System.out.println(">>>>>>>>>>>>>>>>>>>>" + name);
		if (name.contains("impala")) {
			return ImpalaDialect.INSTANCE;
		}
		return null;
	}
}
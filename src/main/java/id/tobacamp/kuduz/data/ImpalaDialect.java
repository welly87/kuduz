package id.tobacamp.kuduz.data;

import org.springframework.data.relational.core.dialect.AnsiDialect;
import org.springframework.data.relational.core.dialect.ArrayColumns;
import org.springframework.data.relational.core.dialect.LockClause;
import org.springframework.data.relational.core.sql.LockOptions;

public class ImpalaDialect extends AnsiDialect {

	public static final ImpalaDialect INSTANCE = new ImpalaDialect();

	@Override
	public LockClause lock() {
		return LOCK_CLAUSE;
	}

	@Override
	public ArrayColumns getArraySupport() {
		return ArrayColumns.Unsupported.INSTANCE;
	}

	private static final LockClause LOCK_CLAUSE = new LockClause() {

		@Override
		public String getLock(LockOptions lockOptions) {
			return "WITH LOCK";
		}

		@Override
		public Position getClausePosition() {
			return Position.AFTER_ORDER_BY;
		}
	};
}
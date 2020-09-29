package id.tobacamp.kuduz.api;

import id.tobacamp.kuduz.model.SfmtaSeries;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class SfmtaSeriesController
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@GetMapping("/sfmta")
	public String sfmta()
	{
		return jdbcTemplate.queryForObject("SELECT AVG(speed) FROM sfmta_kudu", String.class);
	}
}

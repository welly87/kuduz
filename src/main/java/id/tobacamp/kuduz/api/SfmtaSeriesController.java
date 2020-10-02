package id.tobacamp.kuduz.api;

import id.tobacamp.kuduz.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

	@GetMapping("/products")
	public List<Map<String, Object>> products()
	{
		return jdbcTemplate.queryForList("select * from welly.product2 limit 10");
	}

	@GetMapping("/products2")
	public List<Product> products2()
	{
		List<Product> products2 = new ArrayList<>();

		products2.add(new Product("1", "name-1", "xxxx"));
		products2.add(new Product("2", "name-2", "zzzz"));
		products2.add(new Product("3", "name-3", "kkkk"));

		return products2;
	}
}

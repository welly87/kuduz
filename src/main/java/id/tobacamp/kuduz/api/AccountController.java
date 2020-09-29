package id.tobacamp.kuduz.api;

import id.tobacamp.kuduz.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

interface AccountRepository extends CrudRepository<Account, Long>
{

}

@RestController
public class AccountController
{
	@Autowired
	private AccountRepository repository;

	@GetMapping("/accounts")
	public Account accounts(@RequestParam(value = "id", defaultValue = "3") String id) {
		return repository.findById(Long.parseLong(id)).get();
	}
}
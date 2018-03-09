package ping.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ping.intercom.AccountClient;
import ping.model.Account;

@RestController
public class Api {
	protected Logger logger = Logger.getLogger(Api.class.getName());

	@Autowired
	private AccountClient accountClient;

	@RequestMapping("/accounts")
	public List<Account> findAll() {
		logger.info("Account.findAll()");
		return accountClient.findAll();
	}

}

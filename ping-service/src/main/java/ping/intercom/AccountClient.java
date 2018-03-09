package ping.intercom;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ping.model.Account;

@FeignClient("account-service")
public interface AccountClient {

	@RequestMapping(method = RequestMethod.GET, value = "/accounts")
	List<Account> findAll();

}

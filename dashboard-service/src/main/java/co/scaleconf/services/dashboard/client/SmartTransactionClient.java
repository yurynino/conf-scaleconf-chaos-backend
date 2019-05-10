package co.scaleconf.services.dashboard.client;

import co.scaleconf.services.dashboard.model.SmartTransaction;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "smart-service")
public interface SmartTransactionClient {

	@GetMapping("/smart/transactions/{customer}")
    List<SmartTransaction> findByCustomer(@PathVariable("customer") Integer customer);
	
}
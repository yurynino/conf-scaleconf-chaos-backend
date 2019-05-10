package co.scaleconf.services.dashboard.client;

import co.scaleconf.services.dashboard.model.Transaction;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "transaction-service")
public interface TransactionClient {

    @GetMapping("/transactions/{customer}")
    public List<Transaction> findByCustomer(@PathVariable("customer") Integer customer);

}
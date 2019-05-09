package co.scaleconf.services.dashboard.client;

import co.scaleconf.services.dashboard.model.Transaction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "transaction-service")
public interface TransactionClient {

    @GetMapping("/transaction/{id}")
    public Transaction findById(@PathVariable("id") Integer id);

    @PutMapping("/transaction")
    public Transaction update(@RequestBody Transaction customer);

}

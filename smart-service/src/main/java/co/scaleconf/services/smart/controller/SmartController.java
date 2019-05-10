package co.scaleconf.services.smart.controller;

import co.scaleconf.services.smart.model.SmartTransaction;
import co.scaleconf.services.smart.repository.SmartTransactionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/smart")
public class SmartController {

	@Autowired
	SmartTransactionRepository repository;
	
	@PostMapping
	public SmartTransaction add(@RequestBody SmartTransaction product) {
		return repository.save(product);
	}
	
	@PutMapping
	public SmartTransaction update(@RequestBody SmartTransaction product) {
		return repository.save(product);
	}
	
	@GetMapping("/transactions/{customer}")
	public List<SmartTransaction> findByCustomer(@PathVariable("customer") Integer customer) {
		return repository.findByCustomer(customer);
	}
	
	@GetMapping
	public Iterable<SmartTransaction> findAll() {
		return repository.findAll();
	}
	
}

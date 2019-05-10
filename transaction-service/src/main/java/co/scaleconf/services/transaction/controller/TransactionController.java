package co.scaleconf.services.transaction.controller;

import co.scaleconf.services.transaction.model.Transaction;
import co.scaleconf.services.transaction.repository.TransactionRepository;
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
@RequestMapping("/transactions")
public class TransactionController {

	@Autowired
	TransactionRepository repository;
	
	@PostMapping
	public Transaction add(@RequestBody Transaction transaction) {
		return repository.save(transaction);
	}
	
	@PutMapping
	public Transaction update(@RequestBody Transaction transaction) {
		return repository.save(transaction);
	}
	
	@GetMapping("/{customer}")
	public List<Transaction> findByCustomer(@PathVariable("customer") Integer customer) {
		return repository.findByCustomer(customer);
	}
	
}
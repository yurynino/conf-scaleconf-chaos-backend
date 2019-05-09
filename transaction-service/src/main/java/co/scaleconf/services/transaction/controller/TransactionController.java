package co.scaleconf.services.transaction.controller;

import co.scaleconf.services.transaction.model.Transaction;
import co.scaleconf.services.transaction.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class TransactionController {

	@Autowired
	TransactionRepository repository;
	
	@PostMapping
	public Transaction add(@RequestBody Transaction customer) {
		return repository.save(customer);
	}
	
	@PutMapping
	public Transaction update(@RequestBody Transaction customer) {
		return repository.save(customer);
	}
	
	@GetMapping("/{id}")
	public Transaction findById(@PathVariable("id") Integer id) {
		return repository.findById(id).get();
	}
	
}

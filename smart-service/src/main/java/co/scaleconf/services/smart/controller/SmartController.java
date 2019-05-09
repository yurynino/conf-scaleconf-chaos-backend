package co.scaleconf.services.smart.controller;

import co.scaleconf.services.smart.model.SmartTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.scaleconf.services.smart.repository.SmartTransactionRepository;

@RestController
@RequestMapping("/products")
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
	
	@GetMapping("/{id}")
	public SmartTransaction findById(@PathVariable("id") Integer id) {
		return repository.findById(id).get();
	}
	
	@GetMapping
	public Iterable<SmartTransaction> findAll() {
		return repository.findAll();
	}
	
}

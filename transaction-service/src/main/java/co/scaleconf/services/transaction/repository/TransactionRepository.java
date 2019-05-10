package co.scaleconf.services.transaction.repository;

import java.util.List;

import co.scaleconf.services.transaction.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Integer> {

	List<Transaction> findByCustomer(Integer customer);
	
}

package co.scaleconf.services.smart.repository;

import java.util.List;

import co.scaleconf.services.smart.model.SmartTransaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartTransactionRepository extends CrudRepository<SmartTransaction, Integer> {

	List<SmartTransaction> findByCustomer(Integer customer);
	
}

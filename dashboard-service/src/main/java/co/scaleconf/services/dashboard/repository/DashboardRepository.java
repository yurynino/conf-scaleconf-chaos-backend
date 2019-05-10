package co.scaleconf.services.dashboard.repository;

import co.scaleconf.services.dashboard.model.Dashboard;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DashboardRepository extends CrudRepository<Dashboard, Integer> {

	Dashboard getByCustomer(Integer customer);
	
}

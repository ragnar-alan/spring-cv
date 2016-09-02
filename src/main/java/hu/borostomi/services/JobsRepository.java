package hu.borostomi.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hu.borostomi.domain.Jobs;

@Repository
public interface JobsRepository extends CrudRepository<Jobs, Long>{

	@Query("select j from Jobs as j left join j.jobsFeature jf")
	List<Jobs> findAll();
	
}

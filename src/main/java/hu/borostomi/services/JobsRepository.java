package hu.borostomi.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hu.borostomi.domain.Jobs;

@Repository
public interface JobsRepository extends CrudRepository<Jobs, Long>{

	@Query("SELECT j FROM Jobs AS j LEFT JOIN j.jobsFeature jf WHERE jf.lang = ?1")
	List<Jobs> findAll(String lang);
	
}

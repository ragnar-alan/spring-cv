package hu.borostomi.services;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import hu.borostomi.domain.Jobs;

@Component("jobsService")
@Transactional
public class JobsServiceImpl implements JobsService{
	
	private final JobsRepository jobsRepository;
	
	public JobsServiceImpl(JobsRepository jobsRepository) {
		super();
		this.jobsRepository = jobsRepository;
	}

	@Override
	public List<Jobs> listJobs() {
		
		return jobsRepository.findAll();
	}
}

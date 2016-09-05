package hu.borostomi.services;

import java.util.List;
import java.util.Locale;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import hu.borostomi.domain.Jobs;

@Component("jobsService")

public class JobsServiceImpl implements JobsService{
	
	private final JobsRepository jobsRepository;
	
	public JobsServiceImpl(JobsRepository jobsRepository) {
		super();
		this.jobsRepository = jobsRepository;
	}

	@Override
	public List<Jobs> listJobs() {
		Locale locale = LocaleContextHolder.getLocale();
		return jobsRepository.findAll(locale.toString());
	}
}

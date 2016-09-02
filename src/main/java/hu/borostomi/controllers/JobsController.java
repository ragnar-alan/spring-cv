package hu.borostomi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hu.borostomi.domain.Jobs;
import hu.borostomi.services.JobsService;

@Controller
public class JobsController {
	
	
	
	@Autowired
	private JobsService jobsService;
	
	@RequestMapping(value="/jobs", method=RequestMethod.GET)
	public String getJobsPage(Model model) {
		List<Jobs> jobs = jobsService.listJobs();
		model.addAttribute("past_jobs", jobs);
		return "jobs";
	}
	
}

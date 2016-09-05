package hu.borostomi.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hu.borostomi.domain.Jobs;
import hu.borostomi.services.JobsService;

@Controller
public class JobsController {
	
	@Autowired
	private JobsService jobsService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy/MM"), true);
	    binder.registerCustomEditor(Date.class, editor);
	}
	
	@RequestMapping(value="/jobs", method=RequestMethod.GET)
	public String getJobsPage(Model model) {
		List<Jobs> jobs = jobsService.listJobs();
		model.addAttribute("past_jobs", jobs);
		return "jobs";
	}
}

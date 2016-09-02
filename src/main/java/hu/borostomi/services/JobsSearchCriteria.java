package hu.borostomi.services;

import java.io.Serializable;

import org.springframework.util.Assert;

public class JobsSearchCriteria implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String name;

	public JobsSearchCriteria() {
	}

	public JobsSearchCriteria(String name) {
		Assert.notNull(name, "Name must not be null");
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

package hu.borostomi.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="jobs_feature")
public class JobsFeature implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="job_id")
	private Jobs jobs;

	@Id
	@GeneratedValue
	@Column(name="job_f_id")
	private Long jobFeatureId;
	
	
	
	@Column(name="job_f_display_name", nullable = false)
	private String displayName;
	
	@Column(name="job_f_discription", nullable = false)
	private String description;
	
	@Column(name="job_f_competences", nullable = false)
	private String competencies;
	
	@Column(name="job_f_lang", nullable = false)
	private String lang;
	
	@Column(name="created_at", nullable = false)
	private Date createdAt;
	
	@Column(name="updated_at", nullable = false)
	private Date updatedAt;
	
	@Column(name="deleted_at", nullable = false)
	private Date deletedAt;
	
	protected JobsFeature(){}

	public Long getJobFeatureId() {
		return jobFeatureId;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getDescription() {
		return description;
	}

	public String getCompetencies() {
		return competencies;
	}

	public String getLang() {
		return lang;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}


	public Date getDeletedAt() {
		return deletedAt;
	}

	public Jobs getJobs() {
		return jobs;
	}

	public void setJobs(Jobs jobs) {
		this.jobs = jobs;
	}

	public void setJobFeatureId(Long jobFeatureId) {
		this.jobFeatureId = jobFeatureId;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCompetencies(String competencies) {
		this.competencies = competencies;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}
	
	
}

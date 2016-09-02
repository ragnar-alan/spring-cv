package hu.borostomi.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="jobs")
public class Jobs implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "jobs", cascade = CascadeType.ALL)
	private List<JobsFeature> jobsFeature;

	@Id
	@GeneratedValue
	@Column(name = "job_id")
	private Long jobId;
	
	@Column(nullable = false, name="job_admin_name")
	private String adminName;
	
	@Column(nullable = false, name="job_start_date")
	private Date jobStartDate;
	
	@Column(nullable = false, name="job_end_date")
	private Date jobEndDate;
	
	@Column(nullable = false, name="job_company_name")
	private String jobCompanyName;
	
	@Column(nullable = false, name="created_at")
	private Date createdAt;
	
	@Column(nullable = false, name="updated_at")
	private Date updatedAt;
	
	@Column(name="deleted_at")
	private Date deletedAt;
	
	protected Jobs(){}

//	public Jobs(Long jobsId, String adminName, Date jobStartDate, Date jobEndDate, String jobCompanyName,
//			Date createdAt, Date updatedAt, Date deletedAt) {
//		this.jobId = jobsId;
//		this.adminName = adminName;
//		this.jobStartDate = jobStartDate;
//		this.jobEndDate = jobEndDate;
//		this.jobCompanyName = jobCompanyName;
//		this.createdAt = createdAt;
//		this.updatedAt = updatedAt;
//		this.deletedAt = deletedAt;
//	}


	public Long getJobsId() {
		return jobId;
	}

	public String getAdminName() {
		return adminName;
	}
	public Date getJobStartDate() {
		return jobStartDate;
	}

	public Date getJobEndDate() {
		return jobEndDate;
	}

	public String getJobCompanyName() {
		return jobCompanyName;
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

	public List<JobsFeature> getJobsFeature() {
		return jobsFeature;
	}

	public void setJobsFeature(List<JobsFeature> jobsFeature) {
		this.jobsFeature = jobsFeature;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public void setJobStartDate(Date jobStartDate) {
		this.jobStartDate = jobStartDate;
	}

	public void setJobEndDate(Date jobEndDate) {
		this.jobEndDate = jobEndDate;
	}

	public void setJobCompanyName(String jobCompanyName) {
		this.jobCompanyName = jobCompanyName;
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

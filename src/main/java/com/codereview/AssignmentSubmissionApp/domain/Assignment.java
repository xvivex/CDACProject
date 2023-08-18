package com.codereview.AssignmentSubmissionApp.domain;

import javax.persistence.*;


@Entity
public class Assignment {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String status;
	private String githuburl;
	private  String branch;
	private String codeReviewVideoUrl;
	@ManyToOne(optional = false)
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGithuburl() {
		return githuburl;
	}
	public void setGithuburl(String githuburl) {
		this.githuburl = githuburl;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCodeReviewVideoUrl() {
		return codeReviewVideoUrl;
	}
	public void setCodeReviewVideoUrl(String codeReviewVideoUrl) {
		this.codeReviewVideoUrl = codeReviewVideoUrl;
	}
	
	

}

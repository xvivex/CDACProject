package com.codereview.AssignmentSubmissionApp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "authorities")
public class Authority implements GrantedAuthority{

	private static final long serialVersionUID = -9091271292855838708L;
	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @ManyToOne(optional = false)
	    private User user;
	    private String authority;
	    
	    public Authority() {
	    	
	    }
	    
	    public Authority(String authority) {
	    	this.authority=authority;
		}

		public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }

	    @Override
	    public String getAuthority() {
	        return authority;
	    }

	    public void setAuthority(String authority) {
	        this.authority = authority;
	    }

	  
	

}

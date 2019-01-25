package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "autouser")

public class AutoUser {
	@Id
	@Column(name = "autoUserId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long autoUserId;
	@Column(name = "email")
	private String email;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "username")
	private String username;
	@Column(name = "pwd")
	private String password;
	@Column(name = "role")
	private String role;

	public Long getAutoUserId() {
		return autoUserId;
	}

	public void setAutoUserId(Long autoUserId) {
		this.autoUserId = autoUserId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "AutoUser [autoUserId=" + autoUserId + ", email=" + email + ", firstname=" + firstname + ", lastname="
				+ lastname + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}
	
	

}

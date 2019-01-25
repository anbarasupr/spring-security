package com.spring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointment")

public class Appointment {
	@Id
	@Column(name = "appointmentId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long appointmentId;
	@Column(name = "make")
	private String make;
	@Column(name = "model")
	private String model;
	@Column(name = "year")
	private String year;
	@Column(name = "userId")
	private Long userId;
	@Column(name = "appointmentDt")
	private Date appointmentDt;
	@Column(name = "status")
	private String status;
	
	
	
	public Long getAppointmentId() {
		return appointmentId;
	}



	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}



	public String getMake() {
		return make;
	}



	public void setMake(String make) {
		this.make = make;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getYear() {
		return year;
	}



	public void setYear(String year) {
		this.year = year;
	}



	public Long getUserId() {
		return userId;
	}



	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public Date getAppointmentDt() {
		return appointmentDt;
	}



	public void setAppointmentDt(Date appointmentDt) {
		this.appointmentDt = appointmentDt;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", make=" + make + ", model=" + model + ", year=" + year
				+ ", userId=" + userId + ", appointmentDt=" + appointmentDt + ", status=" + status + "]";
	}

	
}

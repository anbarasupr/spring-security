package com.spring.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.Appointment;
import com.spring.entity.AutoUser;

@Transactional
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}

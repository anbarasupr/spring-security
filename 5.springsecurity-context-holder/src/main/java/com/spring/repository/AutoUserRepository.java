package com.spring.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.AutoUser;

@Transactional
public interface AutoUserRepository extends JpaRepository<AutoUser, Long> {
	public AutoUser findByUsername(String usename);
}

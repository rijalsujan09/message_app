package com.projectzero.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectzero.app.entity.SMS;

public interface SmsRepository extends JpaRepository<SMS, Integer> {

}
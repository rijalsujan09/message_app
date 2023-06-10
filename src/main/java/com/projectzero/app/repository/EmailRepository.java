package com.projectzero.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectzero.app.entity.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, String>{



}
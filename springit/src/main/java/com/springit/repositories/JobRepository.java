package com.springit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springit.model.Job;

public interface JobRepository extends JpaRepository<Job, Long> {

}

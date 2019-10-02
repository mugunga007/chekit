package com.springit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springit.model.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {

}

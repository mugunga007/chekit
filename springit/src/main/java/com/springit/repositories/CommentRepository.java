package com.springit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springit.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}

package com.springit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springit.model.Link;

public interface LinkRepository extends JpaRepository<Link,Long> {

}

package com.springit.model;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable {

    @CreatedBy
    @Getter @Setter
    private String createdBy;

    @CreatedDate
    @Getter @Setter
    private LocalDateTime creationDate;

    @LastModifiedBy
    @Getter @Setter
    private String lastModifiedBy;

    @LastModifiedDate
    @Getter @Setter
    private LocalDateTime lastModifiedDate;

   }


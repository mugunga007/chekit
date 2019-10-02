package com.springit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
public class Comment extends Auditable {

	@Id
	@GeneratedValue
	private Long id;
	@NonNull
	private String body;
	
	@ManyToOne @NonNull
	private Link link;
}

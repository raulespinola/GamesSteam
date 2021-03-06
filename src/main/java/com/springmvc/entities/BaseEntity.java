package com.springmvc.entities;

import java.time.OffsetDateTime;

import javax.persistence.*;

import lombok.*;

@Data
@MappedSuperclass
public abstract class BaseEntity {

	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer version;
	private OffsetDateTime creationDate;
	private OffsetDateTime editionDate;
	private OffsetDateTime deleteDate;
}

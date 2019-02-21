package com.springmvc.entities;

import java.io.Serializable;
import java.time.OffsetDateTime;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.*;

@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer version;
	
	@Column(name = "creation_date")
	//Check the date format
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private OffsetDateTime creationDate;
	private OffsetDateTime editionDate;
	private OffsetDateTime deleteDate;
}

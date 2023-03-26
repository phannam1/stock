package com.teecafe.stockservice.api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "tbl_unit")
@Entity
public class UnitEntity {
	@Id
	@GeneratedValue
	private Long Id;
	@Column(name = "name_unit")
	private String nameUnit;
	@Column(name = "created_by",length = 20)
	private String createdBy;
	@Column(name = "updated_by",length = 20)
	private String updatedBy;
}

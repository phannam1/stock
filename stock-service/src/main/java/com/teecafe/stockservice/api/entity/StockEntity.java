package com.teecafe.stockservice.api.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.LazyCollection;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "stock")
@Entity
public class StockEntity {
	@Id
	@GeneratedValue
	private Long Id;
	@Column(name = "name")
	private String name;
	@Column(name = "number",nullable = false)
	private float number;
	@ManyToOne
	@JoinColumn(name = "unit_id")
	private UnitEntity unit;
	@Column(name = "price",nullable = false)
	private float price;
	@Column(name = "created_by",length = 20)
	private String createdBy;
	@Column(name = "updated_by",length = 20)
	private String updatedBy;
	@Column(name = "created_date")
	private String createdDate;
	@Column(name = "expiry_date")
	private String expiryDate;
	@Column(name = "description")
	private String description;

}

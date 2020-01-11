package com.capgemini.retailermaintenance.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="product_info")
public class ProductBean {
	@Id
	@Column
	@GeneratedValue
	private int productId;
	@Column
	private int userId;
	@Column(unique = true,nullable = false)
	private String name;
	@Column
	private int quantity;
	@Column
	private String details;
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userId")
	private UserBean productbean;
	
//	@JsonIgnore
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "userId", referencedColumnName = "userId")
//	private UserBean bean;
	
}

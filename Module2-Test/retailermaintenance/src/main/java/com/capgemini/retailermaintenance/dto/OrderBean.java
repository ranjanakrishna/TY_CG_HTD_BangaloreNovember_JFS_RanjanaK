package com.capgemini.retailermaintenance.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="order_info")
public class OrderBean {
	@Id
	@Column
	@GeneratedValue
	private int orderId;
	@Column
	private int productId;
	@Column
	private int userId;
	
	

}

package com.springboot.h2dbrestapi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;

@Table(name="tbl_customer")
@Entity
//@ToString
public class Customer 
{
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Long age;
	private String location;

	@CreationTimestamp
	@Column(name="created_at", nullable=false, updatable=false)
	private Date createdAt;


	@UpdateTimestamp
	@Column(name="updated_at")
	private Date updatedAt;
public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getAge() {
		return age;
	}


	public void setAge(Long age) {
		this.age = age;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}



}

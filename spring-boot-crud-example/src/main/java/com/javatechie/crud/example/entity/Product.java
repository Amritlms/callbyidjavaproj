package com.javatechie.crud.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "product_tbl")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private String college;
    @OneToOne(cascade=CascadeType.ALL)
    private Description description;
	public Product(int id, String name, String college, Description description) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.description = description;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public Description getDescription() {
		return description;
	}
	public void setDescription(Description description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", college=" + college + ", description=" + description + "]";
	}
	
    
    
    
}

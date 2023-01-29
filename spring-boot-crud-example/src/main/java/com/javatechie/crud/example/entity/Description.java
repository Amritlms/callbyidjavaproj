package com.javatechie.crud.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_tbl1")
public class Description {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roll;
    @Column
    private String branch;
    @Column
    private String section;
	public int getroll() {
		return roll;
	}
	public void setbroll(int roll) {
		this.roll = roll;
	}
	public String getbranch() {
		return branch;
	}
	public void setbranch(String branch) {
		this.branch = branch;
	}
	public String getsection() {
		return section ;
	}
	public void setsection(String section) {
		this.section = section;
	}
	@Override
	public String toString() {
		return "Product [roll=" + roll + ", branch=" + branch + ", section=" + section + "]";
	}
    
}

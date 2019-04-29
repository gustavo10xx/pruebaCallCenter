package com.callcenter.entities;


public class Employee {

	private long id;
	private String role;
	private Boolean available;
	private int orderAttention;
	
	public Employee(long id, String role, Boolean available, int orderAttention) {
		super();
		this.id = id;
		this.role = role;
		this.available = available;
		this.orderAttention = orderAttention;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	public int getOrderAttention() {
		return orderAttention;
	}
	public void setOrderAttention(int orderAttention) {
		this.orderAttention = orderAttention;
	}
	
}

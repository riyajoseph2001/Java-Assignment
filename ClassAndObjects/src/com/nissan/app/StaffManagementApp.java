package com.nissan.app;

import java.util.Scanner;

public class StaffManagementApp {
	private String name, address, id;
	private long phoneNumber;
	private int salary, age;
	public StaffManagementApp() {
		this.name = "NULL";
		this.address = "NULL";
		this.id = "NULL";
		this.phoneNumber = 0;
		this.salary = 0;
		this.age = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StaffManagementApp [name=" + name + ", address=" + address + ", id=" + id + ", phoneNumber="
				+ phoneNumber + ", salary=" + salary + ", age=" + age + "]";
	}
	

	

}


package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeModel")
public class EmployeeModel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name,email,mobileno,address,gender,password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String salary) {
		this.email = salary;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String desg) {
		this.mobileno = desg;
	}
	@Override
	public String toString() {
		return "EmployeeModel [id=" + id + ", name=" + name + ", email=" + email + ", mobileno=" + mobileno + ",address=" + address + ",gender=" + gender + ",password=" + password + "]";
	}
	public EmployeeModel(int id, String name, String email, String mobileno,String address, String gender,String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileno = mobileno;
		this.address = address;
		this.gender = gender;
		this.password=password;
	}
	public EmployeeModel() {}
	
}

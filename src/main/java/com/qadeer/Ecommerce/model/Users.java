package com.qadeer.Ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users1")
public class Users 
{
	@Id
	private String UserName;
	@Column
	private String password;
	@Column
	private String Email;
	@Column
	private String MobileNo;
	@Column
	private String Role;
	
	public String getUserName() 
	{
		return UserName;
	}
	public String getRole() 
	{
		return Role;
	}
	public void setRole(String role) 
	{
		Role = role;
	}
	public void setUserName(String userName) 
	{
		UserName = userName;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getEmail() 
	{
		return Email;
	}
	public void setEmail(String email) 
	{
		Email = email;
	}
	public String getMobileNo() 
	{
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) 
	{
		MobileNo = mobileNo;
	}
}

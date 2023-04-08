package com.zohocrmapp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="leads")

public class Lead extends AbstarctClass {
	@Column(name="first_name",length=45,nullable=false)
	private String firstName;
	
	@Column(name="last_name",length=45,nullable=false)
	private String lastName;
	
	@Column(name="mobile",length=50,nullable=false)
	private int Mobile;
	
	@Column(name="email",length=60,nullable=false)
	private String email;
	private String source;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getMobile() {
		return Mobile;
	}
	public void setMobile(int mobile) {
		Mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}

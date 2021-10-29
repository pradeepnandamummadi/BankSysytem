package com.example.BankSysytem.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Acount")
public class Acount {
	@Id
	private String FirstName;
	private String lastName;
	private String Pan;
	private Date dob;
	private double phoneNo;
	private String email;
	private String gender;
	
	@Override
	public String toString() {
		return "Acount [FirstName=" + FirstName + ", lastName=" + lastName + ", Pan=" + Pan + ", dob=" + dob
				+ ", phoneNo=" + phoneNo + ", email=" + email + ", gender=" + gender + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FirstName == null) ? 0 : FirstName.hashCode());
		result = prime * result + ((Pan == null) ? 0 : Pan.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(phoneNo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Acount other = (Acount) obj;
		if (FirstName == null) {
			if (other.FirstName != null)
				return false;
		} else if (!FirstName.equals(other.FirstName))
			return false;
		if (Pan == null) {
			if (other.Pan != null)
				return false;
		} else if (!Pan.equals(other.Pan))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (Double.doubleToLongBits(phoneNo) != Double.doubleToLongBits(other.phoneNo))
			return false;
		return true;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPan() {
		return Pan;
	}
	public void setPan(String pan) {
		Pan = pan;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public double getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(double phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
	
	



package com.example.BankSysytem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MonthlyStatement {
	@Id
	private String Monthlystatement;
	private String Month;
	
	
	
	@Override
	public String toString() {
		return "MonthlyStatement [Monthlystatement=" + Monthlystatement + ", Month=" + Month + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Month == null) ? 0 : Month.hashCode());
		result = prime * result + ((Monthlystatement == null) ? 0 : Monthlystatement.hashCode());
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
		MonthlyStatement other = (MonthlyStatement) obj;
		if (Month == null) {
			if (other.Month != null)
				return false;
		} else if (!Month.equals(other.Month))
			return false;
		if (Monthlystatement == null) {
			if (other.Monthlystatement != null)
				return false;
		} else if (!Monthlystatement.equals(other.Monthlystatement))
			return false;
		return true;
	}
	public String getMonthlystatement() {
		return Monthlystatement;
	}
	public void setMonthlystatement(String monthlystatement) {
		Monthlystatement = monthlystatement;
	}
	public String getMonth() {
		return Month;
	}
	public void setMonth(String month) {
		Month = month;
	}
	

}

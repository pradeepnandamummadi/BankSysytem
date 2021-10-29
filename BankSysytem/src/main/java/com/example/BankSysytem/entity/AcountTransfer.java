package com.example.BankSysytem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class AcountTransfer {
	
	
	@Id
	    private double fromAcNumber;
	    private double toAcNumber;
	    private double amount;
	    
		@Override
		public String toString() {
			return "AcountTransfer [fromAcNumber=" + fromAcNumber + ", toAcNumber=" + toAcNumber + ", amount=" + amount
					+ "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(amount);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(fromAcNumber);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(toAcNumber);
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
			AcountTransfer other = (AcountTransfer) obj;
			if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
				return false;
			if (Double.doubleToLongBits(fromAcNumber) != Double.doubleToLongBits(other.fromAcNumber))
				return false;
			if (Double.doubleToLongBits(toAcNumber) != Double.doubleToLongBits(other.toAcNumber))
				return false;
			return true;
		}
		public double getFromAcNumber() {
			return fromAcNumber;
		}
		public void setFromAcNumber(double fromAcNumber) {
			this.fromAcNumber = fromAcNumber;
		}
		public double getToAcNumber() {
			return toAcNumber;
		}
		public void setToAcNumber(double toAcNumber) {
			this.toAcNumber = toAcNumber;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
	    

}

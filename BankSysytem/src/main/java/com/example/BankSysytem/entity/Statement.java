package com.example.BankSysytem.entity;	
	import java.time.LocalDate;
	import java.util.Objects;

	import javax.persistence.Entity;
	import javax.persistence.Id;

	@Entity
	public class Statement {

	@Id
	    private LocalDate date;
	    private String fromAcNumber;
	    private String amount;
	    private String finBalance;
	    
	    
		@Override
		public String toString() {
			return "Statement [date=" + date + ", fromAcNumber=" + fromAcNumber + ", amount=" + amount + ", finBalance="
					+ finBalance + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((amount == null) ? 0 : amount.hashCode());
			result = prime * result + ((date == null) ? 0 : date.hashCode());
			result = prime * result + ((finBalance == null) ? 0 : finBalance.hashCode());
			result = prime * result + ((fromAcNumber == null) ? 0 : fromAcNumber.hashCode());
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
			Statement other = (Statement) obj;
			if (amount == null) {
				if (other.amount != null)
					return false;
			} else if (!amount.equals(other.amount))
				return false;
			if (date == null) {
				if (other.date != null)
					return false;
			} else if (!date.equals(other.date))
				return false;
			if (finBalance == null) {
				if (other.finBalance != null)
					return false;
			} else if (!finBalance.equals(other.finBalance))
				return false;
			if (fromAcNumber == null) {
				if (other.fromAcNumber != null)
					return false;
			} else if (!fromAcNumber.equals(other.fromAcNumber))
				return false;
			return true;
		}
		public LocalDate getDate() {
			return date;
		}
		public void setDate(LocalDate date) {
			this.date = date;
		}
		public String getFromAcNumber() {
			return fromAcNumber;
		}
		public void setFromAcNumber(String fromAcNumber) {
			this.fromAcNumber = fromAcNumber;
		}
		public String getAmount() {
			return amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getFinBalance() {
			return finBalance;
		}
		public void setFinBalance(String finBalance) {
			this.finBalance = finBalance;
		}


	    

}

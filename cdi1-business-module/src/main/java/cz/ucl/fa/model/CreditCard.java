package cz.ucl.fa.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: CreditCard
 *
 */
@Entity

public class CreditCard implements Serializable {
	   
	@Id
	@GeneratedValue
	private Long id;
	private String number;
	private String validity;
	private String ownerName;
	private static final long serialVersionUID = 1L;

	public CreditCard() {
		super();
	}   
	public Long getId() {
		return this.id;
	}


	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}   
	public String getValidity() {
		return this.validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}   
	public String getOwnerName() {
		return this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	@Override
	public String toString() {	
		if (number != null && number.length() > 4) return "XXXX-XXXX-XXXX-"+ number.substring(number.length()-4) + ", expires on " + validity;
		else return "";
	}
	
	
   
}

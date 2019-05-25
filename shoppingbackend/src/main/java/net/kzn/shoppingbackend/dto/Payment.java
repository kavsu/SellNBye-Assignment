package net.kzn.shoppingbackend.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "payment")
public class Payment implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@OneToOne
	private Payment payment;
	
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	
	@NotBlank(message = "Please Enter the Card No !")
	private int cardNo;
	
	@NotBlank(message = "Please Enter the card password !")
	private int cardPwd;
	
	@NotBlank(message = "Please Enter the Expiry Date !")
	private String expiryDate;
	@NotBlank(message = "Please Enter the order Date !")
	private Date paymentDate;
	@Column(name = "user_id")
	@JsonIgnore
	private int cus_id;
	@Column(name = "grand_total")
	@JsonIgnore
	private double amount;
	
	
	
	//getters and setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public int getCardPwd() {
		return cardPwd;
	}
	public void setCardPwd(int cardPwd) {
		this.cardPwd = cardPwd;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public int getCus_id() {
		return cus_id;
	}
	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}
	
	@Override
	public String toString() {
		return "Payment [id=" +id + ", Card No =" + cardNo + ", Card Password=" + cardPwd + ", Expiry Date= " + expiryDate + ", Amount = " + amount ;
		
		
	}
}


package com.payment.enity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Payment_tb")

public class Payment {
	@Id
	@GeneratedValue
	private Integer paymentId;
	private String paymentstatus;
	private String paymentTransaction;
	private Integer orderId;
	private Integer amount;
	public Payment(Integer paymentId, String paymentstatus, String paymentTransaction, Integer orderId,
			Integer amount) {
		super();
		this.paymentId = paymentId;
		this.paymentstatus = paymentstatus;
		this.paymentTransaction = paymentTransaction;
		this.orderId = orderId;
		this.amount = amount;
	}
	public Payment() {
		super();
	}
	public Integer getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentstatus() {
		return paymentstatus;
	}
	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	public String getPaymentTransaction() {
		return paymentTransaction;
	}
	public void setPaymentTransaction(String paymentTransaction) {
		this.paymentTransaction = paymentTransaction;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentstatus=" + paymentstatus + ", paymentTransaction="
				+ paymentTransaction + ", orderId=" + orderId + ", amount=" + amount + "]";
	}


}

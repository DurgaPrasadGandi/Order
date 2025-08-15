package com.payment.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.enity.Payment;
import com.payment.respository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepository repo;
	
	public Payment doPayment(Payment payment) {
		payment.setPaymentstatus(paymentProcessing());
		payment.setPaymentTransaction(UUID.randomUUID().toString());
		return repo.save(payment);
		
	}
	
	public String paymentProcessing() {
    	return new Random().nextBoolean()?"success":"false";
    }

}

package com.madhu.paymentOptions;

public class ProcessingPayment {


public boolean makingPayment(String paymentType, double amount) {

if("CreditCard".equals(paymentType)) {
	CreditCard cc= new CreditCard();
	return cc.payment(amount);
}else if("DebitCard".equals(paymentType)) {
	DebitCard cc= new DebitCard();
	return cc.payment(amount);
}else if("UPI".equals(paymentType)) {
	UPI cc= new UPI();
	return cc.payment(amount);
}else
	return false;
}
}

package com.madhu.paymentOptions;

public class ProcessingPayment {
private IPay ipay;
public ProcessingPayment(IPay ipay) {
	this.ipay=ipay;
}
public boolean makingPayment(String paymentType, double amount) {
return ipay.payment(amount);
//if("CreditCard".equals(paymentType)) {
//	CreditCard cc= new CreditCard();
//	return cc.payment(amount);
//}else if("DebitCard".equals(paymentType)) {
//	DebitCard cc= new DebitCard();
//	return cc.payment(amount);
//}else if("UPI".equals(paymentType)) {
//	UPI cc= new UPI();
//	return cc.payment(amount);
//}else
//	return false;
}
}

package com.madhu.paymentOptions;

public class CreditCard implements IPay{
	public boolean payment(Double amount) {
		System.out.println("Paying with CreditCard :"+amount);
		return true;
	}
}

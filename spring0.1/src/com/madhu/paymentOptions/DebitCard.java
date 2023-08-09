package com.madhu.paymentOptions;

public class DebitCard implements IPay {
	public boolean payment(Double amount) {
		System.out.println("Paying with DebitCard :"+amount);
		return true;
	}
}

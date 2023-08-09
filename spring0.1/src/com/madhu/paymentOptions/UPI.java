package com.madhu.paymentOptions;

public class UPI implements IPay {
	public boolean payment(Double amount) {
		System.out.println("Paying with UPI :"+amount);
		return true;
	}

}

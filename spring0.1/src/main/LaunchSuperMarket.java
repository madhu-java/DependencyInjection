package main;

import com.madhu.paymentOptions.ProcessingPayment;

public class LaunchSuperMarket {

	public static void main(String[] args) {
		ProcessingPayment pp = new ProcessingPayment();
		boolean status =pp.makingPayment("CASH", 120.15);
		if(status==true)
			System.out.println("Payment success!!");
		else
			System.out.println("Payment Failed!!");

	}

}

package com.kn.PolymorpismPayment;

public class PaymentDemo {

	public static void main(String[] args) 
	{
		Payment p = new Payment();
		p.bill();
		p.offer();
		p.pay();
		UPI u = new UPI();
		u.bill();
		u.offer();
		u.pay();
		Wallet w = new Wallet();
		w.bill();
		w.offer();
		w.pay();
		Card c = new Card();
		c.bill();
		c.offer();
		c.pay();
	}
}
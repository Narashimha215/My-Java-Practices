package com.kn.Polymopism;

public abstract class SampleAC implements Laptop{

	public void paste(int a, int b, int e) {
		System.out.println(e);
	}

	public void cut(int a, int b,int f) {
		System.out.println(f);
	}
}
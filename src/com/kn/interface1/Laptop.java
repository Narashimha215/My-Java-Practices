package com.kn.interface1;

public interface Laptop {
	public void copy();
	
	public void paste();
	
	public void cut();
	
	public void keyboard();
	
	default void security() {
		sen();
		System.out.println("Security code");
	}

	static void capture() {
		System.out.println("camer capture code");
	}
	private void sen() {
		System.out.println("sen code");
	}
}

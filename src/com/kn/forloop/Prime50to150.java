package com.kn.forloop;

public class Prime50to150 {

	public static void main(String[] args) {
		for (int i =50; i <= 150; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
	}
}
package com.tnsif.prime;

public class prime {
		public static void main(String[] args) {
			int i,j;
			System.out.println("The prime numbers are:");
			for(i=2;i<=100;i++) {
				boolean isPrime = true;
				for(j=2;j<=i/2;j++) {
					if(i%j==0) {
						isPrime=false;
						break;
						
					}
			}
			if(isPrime) {
				System.out.println(i+"");
						}
			}
		}
	}

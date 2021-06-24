package org.primeNumbers;

public class PrimeNumbers {
	public static void getPrime(int number){
		int flag = 0;
		if (number == 0 || number == 1){
			System.out.println(number + " is not a prime number!");
		} else {
			for (int i = 2; i <= number/2; i++){
				if (number % i == 0){
					System.out.println(number + " is not a prime number!");
					System.out.println(number + " has a smaller product " + i + " ");
					flag = 1;
					break;
				}
			}
		}
		if (flag == 0){
			System.out.println(number + " is a prime number!");
		}

	}
}

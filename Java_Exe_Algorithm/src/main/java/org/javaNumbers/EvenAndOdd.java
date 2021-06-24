package org.javaNumbers;

import java.util.Scanner;

public class EvenAndOdd {

	public static void evenAndOddNumber1(int num){
		if (num % 2 == 0){
			System.out.println(num + " Even");
		}else {
			System.out.println(num + " Odd");
		}
	}

	public static void evenAndOddNumberInArray(int[] theArray){

		System.out.println("Even Numbers: ");
		for (int i = 0; i < theArray.length; i++){
			if (theArray[i] % 2 == 0){
				System.out.print(theArray[i] + " ");
			}
		}

		System.out.println();

		System.out.println("Odd Numbers: ");
		for (int i = 0; i < theArray.length; i++){
			if (theArray[i] % 2 != 0){
				System.out.print(theArray[i] + " ");
			}
		}

	}

	public static void oddAndEvenUsingScannerClass(){
		Scanner keyBoard = new Scanner(System.in);
		int theNum = keyBoard.nextInt();
		if (theNum % 2 == 0){
			System.out.println(theNum + " is a Even Number");
		}else if (theNum % 2 != 0){
			System.out.println(theNum + " is a Odd Number");
		}
	}
	public static void oddAndEvenFromArraysUsingScannerClass(){
		Scanner keyBoard = new Scanner(System.in);
		System.out.println("Type your int arrayLength below the line:");
		System.out.println("-----------------------------------");
		int arrayLength = keyBoard.nextInt();
		int[] myArray = new int[arrayLength];
		System.out.println("This time you type your Array Element below the line:");
		System.out.println("-----------------------------------------------------");
		System.out.println("Even Numbers: ");
		for (int i = 0; i < arrayLength; i++){
			myArray[i] = keyBoard.nextInt();
			if (myArray[i] % 2 == 0){
				System.out.print(myArray[i] + " ");
			}
		}

		System.out.println("Odd Numbers: ");
		for (int i = 0; i < arrayLength; i++){
			myArray[i] = keyBoard.nextInt();
			if (myArray[i] % 2 != 0){
				System.out.print(myArray[i] + " ");
			}
		}
		keyBoard.close();
	}
}

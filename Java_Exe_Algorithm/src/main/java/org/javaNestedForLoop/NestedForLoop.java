package org.javaNestedForLoop;

public class NestedForLoop {
	public static void nestedForLoop(){
		int i, j;
		for (i = 0; i < 5; i++){
			for (j = 0; j < 4; j++){
				System.out.println(i + " ===>> " + j);
			}
			System.out.println();
		}
	}

	public static void nestedForLoop1(){
		for (int i = 0; i < 6; i++){
			for (int j = 0; j <= i; j++){
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}

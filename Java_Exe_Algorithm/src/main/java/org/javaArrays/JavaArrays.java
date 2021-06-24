package org.javaArrays;

import java.util.Arrays;

public class JavaArrays {

	public static void printArray(int[] arr1){
		System.out.print("The Array Element: ");
		for (int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}
	}

	public static void printMaxNumInTheArray(int[] arr1){
		int max = arr1[0];
		for (int i = 0; i < arr1.length; i++){
			if (arr1[i] > max){
				max = arr1[i];
			}
		}
		System.out.println(max);
	}

	public static int printMaxNumInTheArray1(int[] theArray){
		int temp, size;
		size = theArray.length;
		for(int i = 0; i < size; i++ ){
			for(int j = i+1; j < size; j++){
				if(theArray[i] > theArray[j]){
					temp = theArray[i];
					theArray[i] = theArray[j];
					theArray[j] = temp;
				}
			}
		}
		return theArray[size-3];
		//return theArray[size];
	}

	public static int printThirdMaxNumber(int[] theArray){
		int size = theArray.length;
		Arrays.sort(theArray);
		System.out.println("Sorted Array: " + Arrays.toString(theArray));
		int	max = theArray[size-3];
		return max;
	}

	public static void sortTheElementsInTheArray(int[] theArray){
		int i, j, temp, size;
		size = theArray.length;
		for (i = 0; i < size; i++){
			for (j = i+1; j < size; j++){
				if (theArray[i] > theArray[j]){
					temp = theArray[i];
					theArray[i] = theArray[j];
					theArray[j] = temp;
				}
			}
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
		System.out.println(theArray[size-3]);
	}

	public static int sortTheElementsInTheArray1(int[] theArray){
		int size = theArray.length;
		int i, j, temp;
		for ( i = 0; i < size; i++){
			//System.out.print(theArray[i] + " ");
			for ( j = i+1; j < size; j++){
				if ( theArray[i] > theArray[j]){
					temp = theArray[i];
					theArray[i] = theArray[j];
					theArray[j] = temp;
				}
			}
		}
		return 0;
	}
	public static void getTheArrayElement(int[] theArray){
		int i, j, temp;
		for (i = 0; i < theArray.length; i++){

			for (j = i+1; j < theArray.length; j++){
				if (theArray[i] > theArray[j]){
					temp = theArray[i];
					theArray[i] = theArray[j];
					theArray[j] = temp;
				}
			}
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
		System.out.println("The third largest element: " + theArray[theArray.length - 3]);
	}
	public static void getTheArrayElement2(int[] theArray){
		int i, j, temp;
		for (i = 0; i < theArray.length; i++){

			for (j = i+1; j < theArray.length; j++){
				if (theArray[i] < theArray[j]){
					temp = theArray[i];
					theArray[i] = theArray[j];
					theArray[j] = temp;
				}
			}
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
		System.out.println("The third smallest element: " + theArray[theArray.length - 3]);
	}
}

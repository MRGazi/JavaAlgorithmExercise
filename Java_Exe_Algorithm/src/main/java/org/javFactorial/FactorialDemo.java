package org.javFactorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FactorialDemo {
public WebDriver driver;
	public static int getFactorial(int num){
		if (num != 0){
			return num * getFactorial(num - 1);
		}else {
			return 1;
		}
	}

	public static void getFactorialResult(int num){
		System.out.println("Factorial of " + "\""+ num +"\""+ " is = " + getFactorial(num));
	}

	public void letUsKnowWebDriver(){
		
	}

}

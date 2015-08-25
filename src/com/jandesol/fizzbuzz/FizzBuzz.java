package com.jandesol.fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		String fizzBuzzVal = ""; 
		for (int i = 1; i < 100; i++) {
			fizzBuzzVal = doFizzBuzz(i);
			System.out.println(fizzBuzzVal);
		}
		System.out.println("");
	}
	
	public static String doFizzBuzz(int number) {
		
		String retVal = "";
		
		Boolean divisibleByThree = isDivisibleByThree(number);
		Boolean divisibleByFive = isDivisibleByFive(number);
		
		if (divisibleByThree && divisibleByFive) {
			retVal = "fizzbuzz";			
		}
		else {
			if (divisibleByThree) {
				retVal = "fizz";
			}
			else if (divisibleByFive) {
				retVal = "buzz";
			}
			else {
				retVal = String.valueOf(number);
			}			
		}
		
		return retVal;
	}
	
	public static Boolean isDivisibleByThree(int number) {
		return (number % 3 == 0);
	}

	public static Boolean isDivisibleByFive(int number) {
		return (number % 5 == 0);
	}
	public static Boolean isDivisibleByThreeAndFive(int number) {
		return (number % 3 == 0 && number % 5 == 0);
	}
}

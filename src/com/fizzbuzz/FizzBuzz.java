package com.fizzbuzz;

public class FizzBuzz {

	public static String getNumber(int i) {
		if (i % 3 == 0) {
			return "Fizz";
		} else if (i % 5 == 0){
			return "Buzz";
		} else {
			return null;
		}
		
	}

}

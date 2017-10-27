package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	public void threeReturnsFizz() {
		assertTrue(FizzBuzz.getNumber(3).equals("Fizz"));
	}
	
	@Test
	public void fiveReturnsBuzz() {
		assertTrue(FizzBuzz.getNumber(5).equals("Buzz"));
	}
	
	@Test
	public void sixReturnsFizz() {
		assertTrue(FizzBuzz.getNumber(6).equals("Fizz"));
	}

}

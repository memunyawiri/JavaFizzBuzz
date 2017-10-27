package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	public void threeReturnsFizz() {
		assertTrue(FizzBuzz.getNumber(3).equals("Fizz"));
	}
	
	@Test
	public void sixReturnsFizz() {
		assertTrue(FizzBuzz.getNumber(6).equals("Fizz"));
	}
	
	@Test
	public void fiveReturnsBuzz() {
		assertTrue(FizzBuzz.getNumber(5).equals("Buzz"));
	}
	
	@Test
	public void tenReturnsBuzz() {
		assertTrue(FizzBuzz.getNumber(10).equals("Buzz"));
	}

	@Test
	public void fifteenReturnsFizzBuzz() {
		assertTrue(FizzBuzz.getNumber(15).equals("FizzBuzz"));
	}
	
	@Test
	public void multipleOfThreeAndFiveReturnsFizzBuzz() {
		assertTrue(FizzBuzz.getNumber(30).equals("FizzBuzz"));
	}
	
	@Test
	public void nonMultipleReturnsnumber() {
		assertTrue(FizzBuzz.getNumber(7).equals("7"));
	}
}

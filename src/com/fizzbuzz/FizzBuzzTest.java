package com.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	public void threeReturnFizz() {
		assertTrue(FizzBuzz.getNumber(3).equals("Fizz"));
	}

}

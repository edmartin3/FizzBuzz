package com.jandesol.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz fizzBuzz = new FizzBuzz();

	@Test
	public void oneReturnsOneTest() {
		assertEquals("1", FizzBuzz.doFizzBuzz(1) );
	}
	
	@Test
	public void isDivisibleByThreeReturnsFizzTest() {
		assertEquals("fizz", FizzBuzz.doFizzBuzz(9));
	}

	@Test
	public void isDivisibleByFiveReturnsBuzzTest() {
		assertEquals("buzz", FizzBuzz.doFizzBuzz(10));
	}

	@Test
	public void isDivisibleByThreeAndFiveReturnsFizzBuzzTest() {
		assertEquals("fizzbuzz", FizzBuzz.doFizzBuzz(30));
	}

}

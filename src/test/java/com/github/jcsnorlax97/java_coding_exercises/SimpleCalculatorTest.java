package com.github.jcsnorlax97.java_coding_exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.flextrade.jfixture.JFixture;

public class SimpleCalculatorTest {
	
	private JFixture _fixture = new JFixture();
	private SimpleCalculator _sut = new SimpleCalculator();

	@Test
	void Add_Should_ReturnTheSumOfTwoIntegers_When_ReceivesTwoIntegers() {
		// Arrange
		int num1 = _fixture.create(Integer.TYPE);
		int num2 = _fixture.create(Integer.TYPE);
		int expected = num1 + num2;
		
		// Act
		int actual = _sut.add(num1, num2);
		
		// Assert
		assertEquals(expected, actual);
	}
}
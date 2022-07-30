package com.github.jcsnorlax97.java_coding_exercises.try_catch;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.Test;

import com.flextrade.jfixture.JFixture;

public class TryCatchExerciseSimulator04Test {

	private JFixture _fixture = new JFixture();
	private TryCatchExerciseSimulator04 _sut = new TryCatchExerciseSimulator04();
	
	@Test
	void Run_ShouldNot_ThrowException_When_ReceivesAValidString()
	{
		// Arrange
		String validStr = _fixture.create(String.class);
		
		// Act & Assert
		assertDoesNotThrow(() -> {
			_sut.run(validStr);
		});
	}
	
	@Test
	void Run_Should_ThrowExceptionWithSpecifiedMessage_When_ReceivesAnEmptyString()
	{
		// Arrange
		final String emptyStr = "";
		
		// Act & Assert
		Exception thrown = assertThrowsExactly(Exception.class, () -> {
			_sut.run(emptyStr);
		}, "A thrown Exception is expected!");
		
		// Assert
		assertEquals(thrown.getMessage(), "Validation Error: The provided string is not valid");
	}
	
	@Test
	void Run_Should_ThrowExceptionWithSpecifiedMessage_When_ReceivesSpecificInvalidString()
	{
		// Arrange
		final String invalidStr = "throw!";
		
		// Act & Assert
		Exception thrown = assertThrowsExactly(Exception.class, () -> {
			_sut.run(invalidStr);
		}, "A thrown Exception is expected!");
		
		// Assert
		assertEquals(thrown.getMessage(), "Validation Error: The provided string is not valid");
		
	}
}
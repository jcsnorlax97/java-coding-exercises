package com.github.jcsnorlax97.java_coding_exercises;

import com.github.jcsnorlax97.java_coding_exercises.try_catch.*;

public class Main {

	public static void main(String[] args) {
		runTryCatchExerciseSimulator(4);
	}
	
	public static void runSimpleCalculatorSimulator()
	{
		SimpleCalculator calculator = new SimpleCalculator();
		int sum = calculator.add(1, 2);
		int diff = calculator.subtract(10, 5);
		
		String result = String.format("Sum = %d | Difference = %d", sum, diff);
		
		System.out.println(result);
	}
	
	public static void runTryCatchExerciseSimulator(int simulatorId)
	{
		try
		{
			switch (simulatorId)
			{
			case 1:
				new TryCatchExerciseSimulator01().run();
				break;
			case 2:
				new TryCatchExerciseSimulator02().run();
				break;
			case 3:
				new TryCatchExerciseSimulator03().run();
				break;
			case 4:
				new TryCatchExerciseSimulator04().run("throw!");
				break;
			default:
				System.out.println("[*] Please enter a valid simulatorId.");
			}			
		}
		catch (Exception ex)
		{
			String exMsg = String.format("[*][Main] An exception has been thrown from a TryCatchExerciseSimulator. The exception msg is: '%s'.", ex.getMessage());
			System.out.println(exMsg);
		}
	}
}
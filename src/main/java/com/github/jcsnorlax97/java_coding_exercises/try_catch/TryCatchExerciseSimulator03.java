package com.github.jcsnorlax97.java_coding_exercises.try_catch;

/***
 * Goal: Throw based on conditions.
 * 
 * @author jcsnorlax97
 */
public class TryCatchExerciseSimulator03 {
	
	public void run()
	{
		int validNum = 1;
		int invalidNum = -1;
		try
		{
			ensureNumIsValid(validNum);
			ensureNumIsValid(invalidNum);
		}
		catch (Exception ex)
		{
			String exMsg = String.format("[*][Catch] An Exception is thrown in the try block! The exception message is: '%s'", ex.getMessage());
			System.out.println(exMsg);
		}
	}
	
	public void ensureNumIsValid(int num) throws Exception
	{
		if (!isNumPositive(num))
		{
			throw new Exception("[*][ensureNumIsValid] Num is invalid!");
		}
		
		System.out.println("[*][ensureNumIsValid] Num is valid!");
	}
	
	public boolean isNumPositive(int num)
	{
		if (num > 0) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
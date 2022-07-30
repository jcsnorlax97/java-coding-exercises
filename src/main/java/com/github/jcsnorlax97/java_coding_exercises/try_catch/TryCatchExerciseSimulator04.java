package com.github.jcsnorlax97.java_coding_exercises.try_catch;

/***
 * Goal: Exercise
 * 
 * @author jcsnorlax97
 */
public class TryCatchExerciseSimulator04 {

	public void run(String str) throws Exception
	{	
		try 
		{
			ensureStrIsValid(str);
		}
		catch (Exception ex)
		{
			throw ex;
		}
	}
	
	/* TODO:
	 * 1) When 'str' (i) is an empty string, or (ii) is equal to 'throw!', throw an exception with a message of 'Validation Error: The provided string is not valid!'.
	 * 2) For all other scenarios, simply print out the string.
	 *  */
	public void ensureStrIsValid(String str)
	{
		// ... codes ...
	}
}
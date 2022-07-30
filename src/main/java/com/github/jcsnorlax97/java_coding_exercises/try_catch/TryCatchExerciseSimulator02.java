package com.github.jcsnorlax97.java_coding_exercises.try_catch;

/***
 * Goal: Try-catch-finally block
 * 
 * @author jcsnorlax97
 */
public class TryCatchExerciseSimulator02 {
	
	public void run() throws Exception
	{
		try
		{
			System.out.println("[*][Try] Let's throw an exception in a method within a try-catch-finally block!");
			throw new Exception("[*][TryCatchExerciseSimulator02] An Exception is thrown in a method within a try-catch-finally block!");
		}
		catch (Exception ex)
		{
			System.out.println("[*][Catch] When any 'Exception' is thrown in the 'try' block, this 'catch' block would get executed.");
			System.out.println("[*][Catch] Usually we will want to propagate the exception to the caller method, such that the exception isn't disappered here.");
			System.out.println("[*][Catch] To do that, we simply need to (i) rethrow the same exception by doing `throw ex` and (ii) add `throws Exception` besides the `run()` method.");
			throw ex; // Note: When this gets commented out, the caller won't receive this exception!
		}
		finally
		{
			System.out.println("[*][Finally] For both successful (no exceptions are thrown) and error (exceptions are thrown) cases, this 'finally' block would get executed after executing the 'try' block and 'catch' block.");
			System.out.println("[*][Finally] This is usually used for ensuring 'File Scanner' or DB connection are closed no matter if the operation is successful or not.");
			System.out.println("[*][Finally] E.g. scanner.close();");			
		}
	}
}
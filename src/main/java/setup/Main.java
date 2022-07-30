package setup;

public class Main {

	public static void main(String[] args) {
		SimpleCalculator calculator = new SimpleCalculator();
		int sum = calculator.add(1, 2);
		int diff = calculator.subtract(10, 5);
		
		String result = String.format("Sum = %d | Difference = %d", sum, diff);
		
		System.out.println(result);
	}
}
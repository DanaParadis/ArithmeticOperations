package operations;

public class Main {

	public static void main(String[] args) {
		// Declaration and initialization of variables
		float num1 = 3.14f;
		float num2 = 14.3f;
		float num3 = 7.23f;

		// Arithmetic operations
		float sum1 = num1 + 4;
		float sum2 = num2 + 9;
		float sum3 = num3 + 2;

		float average = (sum1 + sum2 + sum3) / 3;
		
		// If-else statement to determine which is greater
		float greater;
		if (sum1 > sum2 && sum1 > sum3) {
		    greater = sum1;  
		} else if (sum2 > sum1 && sum2 > sum3) {
		    greater = sum2;
		} else {
		    greater = sum3;
		}

		// If-else statement to determine which is smaller
		float lesser;
		if (sum1 < sum2 && sum1 < sum3) {
		    lesser = sum1;
		} else if (sum2 < sum1 && sum2 < sum3) {
		    lesser = sum2;
		} else {
		    lesser = sum3;
		}

		System.out.println("The greater number is: " + greater);
		System.out.println("The lesser number is: " + lesser);
		
		// Sum of all numbers with a for loop
		float totalSum = 0.0f;
		float[] numbers = {num1, num2, num3};
		float[] totals = {sum1, sum2, sum3};

		for (int i = 0; i < numbers.length; i++) {
		    totalSum += numbers[i];
		}
		System.out.println("The total sum is: " + totalSum);
		
		// While loop to display the numbers one by one 
		int i = 0;
		while (i < numbers.length) {
		    System.out.println("Number " + (i + 1) + ": " + numbers[i]);
		    i++;
		}
		
	}
}
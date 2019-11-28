package adv8to11;

//Using  For Loop
public class FibonacciExample {

	public static void main(String[] args) 
	{
		// Set it to the number of elements you want in the Fibonacci Series
		 int maxNumber = 10; // the Fibonacci Series will have "maxNumber" numbers
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
	        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

	        for (int i = 1; i <= maxNumber; ++i)
	        {
	            System.out.print(previousNumber+" ");
	            /* On each iteration, we are assigning second number
	             * to the first number and assigning the sum of last two
	             * numbers to the second number
	             */

	            // the next number should be the previous number plus next number
	            //(e.g 0+1=1 so the third number of the sequence is 1)
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }

	}

}

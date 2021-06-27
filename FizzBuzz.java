public class FizzBuzz
{
	public static void main(String args[])
	{
		//calling method printFizzBuzz to print FizzBuzz Pattern from 1 to 100.
		printFizzBuzz(100);
	}
	//static method to print Fizz Buzz
	public static void printFizzBuzz(int number)
	{
		// Loop from 1 to n
		for(int counter=1;counter<number;counter++)
		{
			// Printing FizzBuzz for the counter that's divisible by 3 as well as five
			//counter%15==0 can also be used because the number which is multiple of 3 and 5 is divisible of 15.
			if(counter%3==0 && counter%5==0)
				System.out.print("FizzBuzz ");
			//print Fizz When counter is divisible by 3. 
			//It'll only execute when a counter is not divisible by 5 and is divisible by 3.
			else if(counter%3==0)
				System.out.print("Fizz ");
			//print Buzz When counter is divisible by 5. 
			//It'll only execute when a counter is not divisible by 3 and is divisible by 5.
			else if(counter%5==0)
				System.out.print("Buzz ");
			//If counter is not divisible by 3, 5 and both 3 & 5 then print the number.
			else
				System.out.print(counter+" ");
		}
	}
}
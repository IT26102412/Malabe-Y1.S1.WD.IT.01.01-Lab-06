import java.util.Scanner;

public class IT26102412Lab6Q2C{
	public static void main (String[]args){
		
		int number, count = 1, sumOfNumbers = 0;
		double averageOfNumbers;
		String finalOutput = "";
		
		Scanner input = new Scanner(System.in);
		while (count<=10){
			
			System.out.print("Enter a number " + count + ": ");
			number = input.nextInt();
			
			count++;
			
			finalOutput += number + " ";
			
			sumOfNumbers += number;
			
			
		}
		averageOfNumbers = sumOfNumbers/10.0;
		
		System.out.println();
		System.out.println("The numbers you entered are: ");
		System.out.println(finalOutput+"\n");
		
		System.out.println("Sum of the numbers: "+sumOfNumbers);
		System.out.println("Average of the numbers: "+averageOfNumbers);

	}
}
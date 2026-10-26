import java.util.Scanner;

public class IT26102412Lab6Q1{
	public static void main (String[]args){
		
		double number, numSqre, numSqreRoot;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		number = input.nextDouble();
		
		if (number <= 0){
			System.out.println("Error: The number must be greater than zero");
		}else{
			
			numSqre = number * number;
			
			numSqreRoot = Math.sqrt(number);
			
			System.out.println();
			System.out.println("The square of "+number+" is : "+numSqre);
			System.out.println("The square root of "+number+" is : "+numSqreRoot);
		}
		
	}
}
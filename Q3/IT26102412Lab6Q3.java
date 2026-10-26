import java.util.Scanner;

public class IT26102412Lab6Q3{
	public static void main (String[]args){
		
		int number;
		double meanOfSquares, rms;
		
		double sumOfSquares = 0;
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter positive integers (terminate input with -99)");
		
		while(true){
			
			System.out.print("Enter a number: ");
			number = input.nextInt();
			
			if (number == -99){
				break;
			}
			
			if (number <= 0){
				
				System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
			
			}else{
				
				sumOfSquares += Math.pow(number, 2);
				count++;
			
			}
		}
		
		if (count > 0){
			
			meanOfSquares = sumOfSquares / count;
			rms = Math.sqrt(meanOfSquares);
			
			System.out.println();
			System.out.println("The Root Mean Square (RMS) is: "+rms);
			
		}else{
			System.out.println("No positive numbers were entered");
		}
	}
}
import java.util.Scanner;

public class IT26102412Lab6Q2B{
	public static void main (String[]args){
		
		int number, count = 1;
		String finalOutput = "";
		
		Scanner input = new Scanner(System.in);
		while (count<=10){
			
			System.out.print("Enter a number " + count + ": ");
			number = input.nextInt();
			
			count++;
			
			finalOutput += number + " ";
			
			
		}
		
		System.out.println();
		System.out.println("The numbers you entered are: ");
		System.out.print(finalOutput);

	}
}
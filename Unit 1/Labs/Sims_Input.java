
import java.util.Scanner;

public class Sims_Input
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;

		//Integer
		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();

		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();
		
		System.out.println();
		
		//Double
		System.out.print("Enter a double :: ");
		doubleOne = keyboard.nextShort();
		
		System.out.print("Enter a double :: ");
		doubleTwo = keyboard.nextShort();
		
		System.out.println();
		
		//Float
		System.out.print("Enter a float :: ");
		floatOne = keyboard.nextFloat();
		
		System.out.print("Enter a float :: ");
		floatTwo = keyboard.nextFloat();
		
		System.out.println();
		
		//short
		System.out.print("Enter a short :: ");
		shortOne = keyboard.nextShort();
		
		System.out.print("Enter a short :: ");
		shortTwo = keyboard.nextShort();
		
		System.out.println();
	


		//add in input for all variables

		//integers
		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		System.out.println();
		//doubles
		System.out.println("double one = " + doubleOne );
		System.out.println("double two = " + doubleTwo );
		System.out.println();
		//float
		System.out.println("double one = " + floatOne );
		System.out.println("double two = " + floatTwo );
		System.out.println();
		//short
		System.out.println("double one = " + shortOne );
		System.out.println("double two = " + shortTwo );
		System.out.println();
		

		//add in output for all variables


	}
}
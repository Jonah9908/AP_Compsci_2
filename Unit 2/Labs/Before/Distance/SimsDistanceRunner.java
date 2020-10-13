/**
 * SimsDistanceRunner.java  9/25/2020
 *
 * @author - Jonah Sims
 * @author - Period 6
 * @author - Id 883155
 *
 * @author - I received help from ...
 *
*/
import java.util.Scanner;


public class SimsDistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner( System.in );
		//Asks user for Inputs and stores variables for x1,x2,y1,y2
		System.out.print("Enter X1 :: ");
		int x1 = keyboard.nextInt();
		System.out.print("Enter Y1 :: ");
		int y1 = keyboard.nextInt();
		System.out.print("Enter X2 :: ");
		int x2 = keyboard.nextInt();
		System.out.print("Enter Y2 :: ");
		int y2 = keyboard.nextInt();
		//instantiate a Distance object
		SimsDistance distance = new SimsDistance();
		//Prints final distance
		System.out.print("Distance == ");
		System.out.print(String.format("%.3f", distance.getDistance( x1, y1, x2, y2)));
	}
}

/*

Sample Data :
1 1 2 1
1 1 -2 2
1 1 0 0



Sample Output :
Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: 2
Enter Y2 :: 1
distance == 1.000


Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: -2
Enter Y2 :: 2
distance == 3.162


Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: 0
Enter Y2 :: 0
distance == 1.414

*/
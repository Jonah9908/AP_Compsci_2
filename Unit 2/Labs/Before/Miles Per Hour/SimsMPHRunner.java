/**
 * SimsMPHRunner.java  9/25/2020
 *
 * @author - Jonah Sims
 * @author - Period 6
 * @author - Id 883155
 *
 * @author - I received help from ...
 *
*/

import java.util.Scanner;


public class SimsMPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner( System.in );

		System.out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		System.out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		System.out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		//call the getMPH method and pass in
		SimsMilesPerHour milesPerHour = new SimsMilesPerHour();
		//Prints input statement
		System.out.print( "\n" + dist + " miles in " + hrs + " hour and " + mins + " minutes = ");
		//Prints MPH
		System.out.print( String.format("%.0f", milesPerHour.getMPH(dist, hrs, mins)) + " MPH.");
	}
}

/*

Sample Output :
Enter the distance :: 45
Enter the hours :: 0
Enter the minutes :: 32

45 miles in 0 hour and 32 minutes = 84 MPH.




Enter the distance :: 96
Enter the hours :: 1
Enter the minutes :: 43

96 miles in 1 hour and 43 minutes = 56 MPH.




Enter the distance :: 100
Enter the hours :: 2
Enter the minutes :: 25

100 miles in 2 hour and 25 minutes = 41 MPH.




Enter the distance :: 50
Enter the hours :: 2
Enter the minutes :: 25

50 miles in 2 hour and 25 minutes = 21 MPH.

*/
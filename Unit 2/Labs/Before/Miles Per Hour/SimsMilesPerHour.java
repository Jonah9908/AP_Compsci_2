/**
 * SimsMilesPerHour.java  9/25/2020
 *
 * @author - Jonah Sims
 * @author - Period 6
 * @author - Id 883155
 *
 * @author - I received help from ...
 *
*/

public class SimsMilesPerHour
{
	public static double getMPH( int dist, int hrs, int mins )
	{
		//Found total time in mins
		double totalTime = mins + (hrs * 60);
		//Calculated Miles per Min then changed to Miles per hour
		double milesPerHour = 60 * (dist / totalTime);
		//Returns Miles Per Hour
		return milesPerHour;
	}
}


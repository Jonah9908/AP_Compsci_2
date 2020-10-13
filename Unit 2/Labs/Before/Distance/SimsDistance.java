/**
 * SimsDistance.java  9/25/2020
 *
 * @author - Jonah Sims
 * @author - Period 6
 * @author - Id 883155
 *
 * @author - I received help from ...
 *
*/
//Finds the distance between 2 points

public class SimsDistance
{
	public static double getDistance(int xOne, int yOne, int xTwo, int yTwo )
	{
		//Calculates distance using parameters
		return Math.sqrt(Math.pow(xTwo - xOne, 2) + Math.pow(yTwo - yOne, 2));
	}
}
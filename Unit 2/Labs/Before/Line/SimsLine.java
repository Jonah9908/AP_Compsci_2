/**
 * SimsLine.java  9/25/2020
 *
 * @author - Jonah Sims
 * @author - Period 6
 * @author - Id 883155
 *
 * @author - I received help from ...
 *
*/

public class SimsLine
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		//Find diffrence of Y values
		double yDiff = y2 - y1;
		//Find distance of X values
		double xDiff = x2 - x1;
		//Divide Diff of x and Diff of y to calculate slope
		double slope = yDiff / xDiff;
		//Returns Slope
		return slope;
	}
}
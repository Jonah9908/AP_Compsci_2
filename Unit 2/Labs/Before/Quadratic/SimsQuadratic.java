/**
 * SimsQuadratic.java  9/35/2020
 *
 * @author - Jonah Sims
 * @author - Period 6
 * @author - Id 883155
 *
 * @author - I received help from ...
 *
*/

public class SimsQuadratic
{
	public static double getRootOne( int a, int b, int c )
	{
		//Finds the value of everything rooted
		double sqrtSection = Math.sqrt(Math.pow(b , 2) - ((4 * a) * c));
		//Finds the value of the top part of the equation
		double topSection = -b + sqrtSection;
		//Divides top section and bottom section to find the first root
		double fullRootOne = topSection / (2 * a);
		//Returns all of root one
		return fullRootOne;
	}

	public static double getRootTwo( int a, int b, int c )
	{
		//Finds the value of everything rooted
		double sqrtSection = Math.sqrt(Math.pow(b , 2) - ((4 * a) * c));
		//Finds the value of the top part of the equation
		double topSection = -b - sqrtSection;
		//Divides top section and bottom section to find the first root
		double fullRootTwo = topSection / (2 * a);
		//Returns all of root two
		return fullRootTwo;
	}
}
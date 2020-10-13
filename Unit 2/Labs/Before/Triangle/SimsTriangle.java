/**
 * SimsTriangle.java  10/1/2020
 *
 * @author - Jonah Sims
 * @author - Period 5
 * @author - Id 883155
 *
 * @author - I received help from ...
 *
*/

public class SimsTriangle
{
	private int sideA, sideB, sideC;
	private double perimeter;

	public SimsTriangle(int a, int b, int c)
	{
		//set the variables of triangle a,b,c to their respective parameters
		sideA = a;
		sideB = b;
		sideC = c;
	}

	public void calcPerimeter( )
	{
		//calcultate permiter by adding a,b,c
		perimeter = sideA + sideB + sideC;
	}

	public double getArea( )
	{
		//calculate and return area
		double s = perimeter / 2;
		double area = Math.sqrt( s * ( s - sideA ) * ( s - sideB ) * (s - sideC ));
		return area;
	}
}
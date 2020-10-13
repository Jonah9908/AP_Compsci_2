/**
 * SimsLineRunner.java  9/25/2020
 *
 * @author - Jonah Sims
 * @author - Period 6
 * @author - Id 883155
 *
 * @author - I received help from ...
 *
*/
public class SimsLineRunner
{
	public static void main( String[] args )
	{
		//instantiate a Distance object
		SimsLine line = new SimsLine();
		//Test cases, use parameters to calculate slope
		System.out.println("Slope is :: " + String.format("%.2f", SimsLine.getSlope( 1, 9, 14, 2 )));
		System.out.println("Slope is :: " + String.format("%.2f", SimsLine.getSlope( 1, 7, 18, 3 )));
		System.out.println("Slope is :: " + String.format("%.2f", SimsLine.getSlope( 6, 4, 2, 2 )));
		System.out.println("Slope is :: " + String.format("%.2f", SimsLine.getSlope( 4, 4, 5, 3 )));
		System.out.println("Slope is :: " + String.format("%.2f", SimsLine.getSlope( 1, 1, 2, 9 )));
		System.out.println("Slope is :: " + String.format("%.2f", SimsLine.getSlope( 1, 7, 2, 9 )));
	}
}
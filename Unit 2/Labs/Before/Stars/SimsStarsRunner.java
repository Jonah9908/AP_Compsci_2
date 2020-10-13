/**
 * SimsStarsRunner.java  9/26/2007
 *
 * @author - Jonah Sims
 * @author - Period 6
 * @author - Id 883155
 *
 * @author - I received help from Avinash Almingari
 *
*/

public class SimsStarsRunner
{
	public static void main(String[] args)
	{
      //instantiate a StarsAndStripes object
		SimsStarsAndStripes stars = new SimsStarsAndStripes();
      //call the methods needed to make the patterns on the word document
		stars.starsAndStripes();
		stars.printASmallBox();
		stars.printTwoBlankLines();
		stars.printABigBox();
	}
}
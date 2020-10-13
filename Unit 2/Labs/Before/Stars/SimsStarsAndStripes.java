/**
 * SimsStarsAndStripes.java  9/23/2020
 *
 * @author - Jonah Sims
 * @author - Period 6
 * @author - Id 883155
 *
 * @author - I received help from ...
 *
 *
*/

public class SimsStarsAndStripes
{
    public void starsAndStripes()
	{
   	  //this is the message that first appers when you run the program
      	System.out.println("StarsAndStripes");
      	printTwoBlankLines();
    }

	public void printTwentyStars()
	{
   	  // This prints 20 "stars"
   		System.out.println("********************");
	}

	public void printTwentyDashes()
    {
   	  // This prints 20 dashes
   		System.out.println("--------------------");
    }

	public void printTwoBlankLines()
	{
   	  //This prints out 2 blank lines
   		System.out.println("");
		System.out.println("");
	}

	public void printASmallBox()
	{
	  //This prints a "small box" made up of 20 stars and dashes on diffrent lines
		printTwentyDashes();
		printTwentyStars();
		printTwentyDashes();
		printTwentyStars();
		printTwentyDashes();
		printTwentyStars();
		printTwentyDashes();
	}

	public void printABigBox()
	{
	  //This prints 2 small boxes, for description of small box look above
		printASmallBox();
		printASmallBox();
	}
}
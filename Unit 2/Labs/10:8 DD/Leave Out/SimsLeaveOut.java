/**
 * SimsLeaveOut.java  10/8/2020
 *
 * @author - Jonah Sims
 * @author - Period 5
 * @author - Id 883155
 *
 * @author - I received help from ...
 *
*/

public class SimsLeaveOut
{
	//pre : a.length() > 1
	//post : string returned minus character at i
	public static String go( String a, int i)
	{
		//takes the 2 peices of the orginal string (excluding the index of "i") to create a new string without i
		return a.substring(0, i) + a.substring(i + 1, a.length());
	}
}
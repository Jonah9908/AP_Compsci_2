/**
 * SimsMiddle.java  10/8/2020
 *
 * @author - Jonah Sims
 * @author - Period 6
 * @author - Id 883155
 *
 * @author - I received help from ...
 *
*/

public class SimsMiddle
{
	//pre : a.length() > 1
	//post : midddle letter of string a returned
	public static char go( String a )
	{
		//finds the middle index spot
		int i = Math.round(a.length() / 2);
		//returns middle index spot
		return a.charAt(i);
	}
}
/**
 * SimsFirstLast.java  10/8/20
 *
 * @author - Jonah Sims
 * @author - Period 5
 * @author - Id 883155
 *
 * @author - I received help from ...
 *
*/

public class SimsFirstLast
{
	public static String go( String a, String b )
	{
		//returns the 1st character of string a and the last character of string b
		return a.charAt(0) + b.substring(b.length() - 1);
	}
}
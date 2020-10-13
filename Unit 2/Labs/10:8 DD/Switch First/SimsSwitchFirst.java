/**
 * SimsSwitchFirst.java 10/8/2020
 *
 * @author - Jonah Sims
 * @author - Period 5
 * @author - Id 883155
 *
 * @author - I received help from ...
 *
*/
public class SimsSwitchFirst
{
	public static String go( String a, String b )
	{
		//returns the front char of string b, then the rest of string a
		return b.charAt(0) + a.substring(1, a.length());
	}
}
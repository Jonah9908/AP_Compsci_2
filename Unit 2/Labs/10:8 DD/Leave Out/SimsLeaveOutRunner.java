/**
 * SimsLeaveOutRunner.java  9/26/2007
 *
 * @author - Jonah Sims
 * @author - Period 5
 * @author - Id 883155
 *
 * @author - I received help from ...
 *
*/

public class SimsLeaveOutRunner
{
	public static void main( String[] args )
	{
		//outputs for diffrent strings
		SimsLeaveOut s = new SimsLeaveOut();
		System.out.println( s.go( "dog", 1 ) );
		System.out.println( s.go( "aplus", 2 ) );
		System.out.println( s.go( "catgiraffe", 3 ) );
		System.out.println( s.go( "ap", 1 ) );
		System.out.println( s.go( "pluscat", 4 ) );
		System.out.println( s.go( "aplusdog#13337#", 9 ) );
		System.out.println( s.go( "code", 2 ) );
		System.out.println( s.go( "wow", 1 ) );
		System.out.println( s.go( "catsand", 0 ) );
	}
}
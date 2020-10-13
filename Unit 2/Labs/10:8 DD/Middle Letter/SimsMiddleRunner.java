/**
 * SimsMiddleRunner.java  10/8/2020
 *
 * @author - Jonah Sims
 * @author - Period 5
 * @author - Id 883155
 *
 * @author - I received help from ...
 *
*/

public class SimsMiddleRunner
{
	public static void main( String[] args )
	{
		//outputs middle character of each string
		SimsMiddle s = new SimsMiddle();
		System.out.println( s.go( "dog" ) );
		System.out.println( s.go( "aplus" ) );
		System.out.println( s.go( "catgiraffe" ) );
		System.out.println( s.go( "ap" ) );
		System.out.println( s.go( "pluscat" ) );
		System.out.println( s.go( "aplusdog#13337#" ) );
		System.out.println( s.go( "code" ) );
		System.out.println( s.go( "wow" ) );
		System.out.println( s.go( "catsand" ) );
	}
}
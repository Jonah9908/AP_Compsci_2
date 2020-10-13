/**
 * SimsAvgLenRunner.java  10/8/2020
 *
 * @author - Jonah Sims
 * @author - Period 5
 * @author - Id 883155
 *
 * @author - I received help from ...
 *
*/
public class SimsAvgLenRunner
{
	public static void main(String[] args)
	{
		//prints average of 2 strings
		SimsAvgLen s = new SimsAvgLen();
		System.out.println( s.go( "dog", "cats" ) );
		System.out.println( s.go( "aplus", "pigs" ) );
		System.out.println( s.go( "catgiraffe", "apluscompsci" ) );
		System.out.println( s.go( "ap", "aplus" ) );
		System.out.println( s.go( "pluscat", "dogsaplus" ) );

		//you can call static methods on a reference
		//or directly on the class name - Math.random() is another example

		System.out.println( SimsAvgLen.go( "#", "#" ) );
		System.out.println( SimsAvgLen.go( "aplusdog#13337#", "pigaplusprogram" ) );
		System.out.println( SimsAvgLen.go( "code", "code1234" ) );
		System.out.println( SimsAvgLen.go( "wow", "eplus" ) );
		System.out.println( SimsAvgLen.go( "catsand" , "aplusdogsaplus" ) );
		System.out.println( SimsAvgLen.go( "7", "77777" ) );
	}
}
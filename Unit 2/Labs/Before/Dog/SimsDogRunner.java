/**
 * SimsDogRunner.java  10/1/2020
 *
 * @author - Jonah Sims
 * @author - Period 5
 * @author - Id 883155
 *
 * @author - I received help from ...
 *
*/

public class SimsDogRunner
{
	public static void main(String[] args )
	{
		//object d of SimsDog is created
		//the first statment passes in the name "rover" for the parameter
		SimsDog d = new SimsDog("rover");
		//meathods used to get the name and age of the dog
		System.out.println( d.getPeopleAge( 7 ) );
		d.increaseAgeByOne();
		d.increaseAgeByOne();
		System.out.println( d.getPeopleAge( 11 ) );
		System.out.println( d.getName() );
		d.increaseAgeByOne();
		d.increaseAgeByOne();
		d.increaseAgeByOne();
		d.increaseAgeByOne();
		System.out.println( d.getPeopleAge( 8 ) );
		//a new object is created for dog g
		SimsDog g = new SimsDog("bob", 3);
		System.out.println( g.getName() );
		System.out.println( g.getPeopleAge( 5 ) );
	}
}
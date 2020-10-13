/**
 * SimsDog.java  10/1/2020
 *
 * @author - Jonah Sims
 * @author - Period 5
 * @author - Id 883155
 *
 * @author - I received help from ...
 *
*/


public class SimsDog
{
	private int age;
	private String name;

	public SimsDog( String n )
	{
  	// initate the age of the dog to 1 and set the name of the dog to the n parameter
		age = 1;
		name = n;
	}

	public SimsDog( String n, int a )
	{
 		//set the name and age variables to n and a
		age = a;
		name = n;
	}

	public void increaseAgeByOne()
	{
  	 	//increase dog age by 1
		age += 1;
	}

	public int getPeopleAge( int val )
	{
  	 	//Multiplies people age and dog age
	 	val *= age;
  	 	return val;
	}

	public int getAge()
	{
		//returns final age
		return age;
	}

	public String getName()
	{
		// returns the name after you set it in the constructor
		return name;
	}

	public String toString()
	{
		return "Dog - " + name + " " + age;
  	}
}

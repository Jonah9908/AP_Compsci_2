import java.util.Scanner; 
public class Sims_FahrenheitRunner
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner( System.in );
		System.out.print( "Enter the fahrenheit value :: " );
		double f = kb.nextDouble();
		
		//print your answer here
		f-= 32;
		System.out.print(f*5/9 + " degrees Celsius");
		double x = 4/3;
		System.out.println(x);
	
}
}
/*
 
Sample Data: 
98.6
52.30
82.45
75.00
100.00

Sample Output : 
37.00 degrees Celsius
11.28 degrees Celsius
28.03 degrees Celsius
23.89 degrees Celsius
37.78 degrees Celsius


*/

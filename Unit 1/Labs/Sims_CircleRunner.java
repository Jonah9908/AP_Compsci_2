import java.util.Scanner; 
public class Sims_CircleRunner
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner( System.in );
		System.out.print( "Enter the radius :: " );
		double radius = kb.nextDouble();
		//print your answer here
		double area = (radius*radius)*(Math.PI);
		System.out.println(area);
	}
}

/*
 
Sample Data: 
7.5
10
72.534
55
101
99.952




Sample Output : 
Circle area is :: 176.71
Circle area is :: 314.16
Circle area is :: 16528.49
Circle area is :: 9503.32
Circle area is :: 32047.39
Circle area is :: 31385.77
Circle area is :: 31415.93




*/

package udacity.ProblemSet3;



public class YardCalculator 
{
	double len;
	double wid;
	public static final double METERS_PER_FOOT = 0.3048;
	
	public YardCalculator(double length, double width) 
	{
		len = length*METERS_PER_FOOT;
		wid = width*METERS_PER_FOOT;
	}
	public double perimeter()
	{
		return 2*(len+wid);
	}
	public double area()
	{
		return len*wid;
	}
	public double diagonal()
	{
		return Math.sqrt(Math.pow(wid, 2) + Math.pow(len, 2));
	}
	
}

package udacity.ProblemSet3;


public class Balloon
{
	double radius = 0;
	double volume = 0;
	
	void addAir(double amount)
	{
		volume = volume + amount;
	}
	double getVolume()
	{
		return volume;
	}
	double getSurfaceArea()
	{
		return 4.0*Math.PI*Math.pow(radius,2.0);
	}
	double getRadius()
	{
		radius = Math.pow(((3.0 * volume)/(4.0 * Math.PI)),(1/3.0));
		return radius;
	}
}

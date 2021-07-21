package testYantra;

public class challengeQuestion2 
{
	public double area(double radius)
	{
		double pi = 3.14;
		double area_Of_Circle = pi * radius * radius;
		if(area_Of_Circle < 0)
		{
			return -1.0;
		}
		return area_Of_Circle;
	}
	public double area(double x,double y)
	{
		double area_Of_Rectangle = x * y;
		if(area_Of_Rectangle < 0)
		{
			return -1.0;
		}
		return area_Of_Rectangle;
	}
}

package testYantra;

public class challengeQuestion 
{
	public void getDurationString(int minutes,int seconds)
	{
		int hours = 60;
		int totalMinutes = 0;
		int x = 0;
		 if(minutes>=0 && seconds>=0 && seconds <=59)			//checking the first parameter such that minutes is greater than Zero
		 {
			 x = minutes/hours;	// "XXh YYm ZZs"
			 
			 totalMinutes = minutes - x*hours;
			 System.out.println(x+"h"+" "+totalMinutes+"m"+" "+seconds+"s");
		 }
		 else
		 {
			 System.out.println("Invalid Value");
		 }
	}
	public void getDurationString(int seconds)
	{
		int minutes = 60;
		int totalMinutes = 0;
		if(seconds >=0)
		{
			totalMinutes = seconds / minutes;
			seconds = seconds - totalMinutes* minutes;
			System.out.print(totalMinutes+" "+seconds);
		}
		else
		{
			System.out.println("Invalid Option");
		}
	}
}

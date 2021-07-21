package testYantra;

public class challengeMain {

	public static void main(String[] args) {
		
		challengeQuestion c = new challengeQuestion();
		c.getDurationString(200,50);
		c.getDurationString(150);
		
		System.out.println("\n");

		challengeQuestion2 c1 = new challengeQuestion2();
		c1.area(10);
		
		
		System.out.println("\n"+"Area of a circle :" +c1.area(10));
		System.out.println("Area Of Traingele : " +c1.area(1, -20));
		System.out.println("Area Of Traingele : " + c1.area(20, 30));
		
		System.out.println("\n");
		
		challengeQuestion3 c2 = new challengeQuestion3();
		c2.printEqual(20, 20, 20);
		c2.printEqual(10, 20, 30);
		c2.printEqual(-20, 20, 30);
		
		System.out.println("\n");
		
		challengeQuestion4 c3 = new challengeQuestion4();
		c3.isCatPlaying(false, 40);
		c3.isCatPlaying(true, 40);
		c3.isCatPlaying(true, 50);

	}

}

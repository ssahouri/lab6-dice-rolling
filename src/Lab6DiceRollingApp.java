import java.util.Random;
import java.util.Scanner;

public class Lab6DiceRollingApp {


	public static void main(String[] args) {
		
		System.out.println("Welcome to the Grand Circus Casino!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many sides should each die have?");
		int userInput = sc.nextInt();
		
		generateRandomDieRoll(userInput);
		
		sc.close();
		

	}
	private static void generateRandomDieRoll(int sides) {
		
		String userContinue;
		Scanner sc = new Scanner(System.in);

		

		do {
		Random rand = new Random();
		
			int roll = 1;
			System.out.println("Roll " + roll );
			
		//generate random number based on number of sides
		  int a = rand.nextInt(sides) + 1;
		  System.out.println(a);
		  int b = rand.nextInt(sides) + 1;
		  System.out.println(b);
		  
		  roll++;
		  
		  System.out.println("Roll again? (y/n)");
		  userContinue = sc.next();
		  
		}while(userContinue.equals("y") || userContinue.equals("Y")); 
		
		System.out.println("Goodbye!");
		sc.close();
		  

	}

}

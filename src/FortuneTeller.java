import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Let me tell you your future mon. Madame Strange knows all.");
		System.out.println("You think a psyhic would know these but...");
		System.out.println("What's your first and last name?");
		String firstName = input.next();
		String lastName = input.next();
		System.out.println("How old are you?");
		int userAge = input.nextInt();

		System.out.println("What month were you born?");
		int birthMonth = input.nextInt();

		
			
		System.out.println("What is your favorite ROYGBIV color?");
		String favoriteColor = input.next().toLowerCase();
			
		
				while (favoriteColor.equalsIgnoreCase("help")){
					System.out.println("The ROYGBIV colors are red, blue, green, violet, indigo, yellow, and orange.");
					System.out.println("What is your favorite ROYGBIV color?");
					favoriteColor = input.next();
					}
					
					switch (favoriteColor) {
					
					case "violet":
					case "indigo":
					case "yellow":
					case "red":
					case "blue":
					case "green":
					case "orange":
					break;
					default:
						System.out.println("You have entered an invalid color.");
						System.out.println("The ROYGBIV colors are red, blue, green, yellow, orange, indigo, and violet.");
						System.out.println("What's your favorite color?");
						favoriteColor = input.next();
					}
					
				
			
		
			
		
		System.out.println("How many siblings do you have?");
		int siblingNum = input.nextInt();
		
		System.out.println("Alright. Are you ready for your fortune? Yes or no.");
		String fortuneReady = input.next();

		while (fortuneReady.equalsIgnoreCase("no")) {
			System.out.println("You can't run from the future mon!");
			System.out.println("Are you ready for your fortune now?");
			fortuneReady = input.next();
		}

		// Calculating retirement age by determining if user's age is even or
		// odd
		if (userAge % 2 == 1) {
			userAge = 30;
		} else {
			userAge = 15;
		}

		// Using if else statements to determine user's vacation home based on
		// how many siblings they have
		String vacationHome = null;


		if (siblingNum == 0) {
			vacationHome = "Bora Bora";
		} else if (siblingNum == 1) {
			vacationHome = "New Orleans";
		} else if (siblingNum == 2) {
			vacationHome = "NYC";
		} else if (siblingNum == 3) {
			vacationHome = "Madrid";
		} else if (siblingNum < 0) {
			vacationHome = "Fukishima";
		} else {
			vacationHome = "Bangkok";
		}

		// Determining a car type for the user based on color preference

		String carType = null;

		switch (favoriteColor) {
		case "indigo":
			carType = " by Hovercraft";
			break;
		case "red":
			carType = "in a Lamborghini Mercy";
			break;
		case "blue":
			carType = "by Vespa";
			break;
		case "green":
			carType = "in a Station Wagon";
			break;
		case "yellow":
			carType = "in the Batmobile";
			break;
		case "orange":
			carType = "by ATV";
			break;
		case "violet":
			carType = "in a Tesla";
			break;
		default:
			break;
		}

		double bankBalance;

		switch (birthMonth) {
		case 1:
		case 2:
		case 3:
		case 4:
			bankBalance = 8798798;
			break;
		case 5:
		case 6:
		case 7:
		case 8:
			bankBalance = 1239.29;
			break;
		case 9:
		case 10:
		case 11:
		case 12:
			bankBalance = 45090.47;
			break;
		default:
			bankBalance = 0.00;
			break;
		}

		NumberFormat bankFormatting = NumberFormat.getCurrencyInstance(Locale.US);

		System.out.println(firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase() + " "
				+ lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase() + " will retire in "
				+ userAge + " years with " + bankFormatting.format(bankBalance) + ", with a vacation home in "
				+ vacationHome + ", and will travel " + carType);
 
		System.out.println("Live long and prosper");
	}

}

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;

public class FortuneTeller {

	public static void checkForQuit(String quitString) {
		if (quitString.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Let me tell you your future mon. Madame Strange knows all.");
		System.out.println("You think a psyhic would know these but...");

		System.out.println("What is your first name?");
		String firstName = input.next();
		checkForQuit(firstName);

		System.out.println("What is your last name?");
		String lastName = input.next();
		checkForQuit(lastName);

		System.out.println("How old are you?");
		String userAgeString = input.next();
		checkForQuit(userAgeString);
		int userAge = Integer.parseInt(userAgeString);

		System.out.println("What month were you born? \nPlease enter the corresponding numerical value for the month.");
		String birthMonthString = input.next();
		checkForQuit(birthMonthString);
		int birthMonth = Integer.parseInt(birthMonthString);

		System.out.println("What is your favorite ROYGBIV color?");
		String favoriteColor = input.next().toLowerCase();
		checkForQuit(favoriteColor);
		favoriteColor = favoriteColor.toLowerCase();

		while (favoriteColor.equalsIgnoreCase("help")) {
			System.out.println("The ROYGBIV colors are red, blue, green, violet, indigo, yellow, and orange.");
			System.out.println("What is your favorite ROYGBIV color?");
			favoriteColor = input.next();
			checkForQuit(favoriteColor);
			favoriteColor = favoriteColor.toLowerCase();
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
			favoriteColor = input.next().toLowerCase();
			checkForQuit(favoriteColor);
		}

		System.out.println("How many siblings do you have?");
		String siblingNumString = input.next();
		checkForQuit(siblingNumString);
		int siblingNum = Integer.parseInt(siblingNumString);

		System.out.println("Alright. Are you ready for your fortune? Yes or no.");
		String fortuneReady = input.next();
		checkForQuit(fortuneReady);

		while (fortuneReady.equalsIgnoreCase("no")) {
			System.out.println("You can't run from the future mon!");
			System.out.println("Are you ready for your fortune now?");
			fortuneReady = input.next();
			checkForQuit(fortuneReady);
		}

		if (userAge % 2 == 1) {
			userAge = 30;
		} else {
			userAge = 15;
		}

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
			System.out.println("by foot because you couldn't follow directions :(");
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
				+ vacationHome + ", and will travel " + carType + ".");

		System.out.println("Live long and prosper my friend.");

		input.close();
		System.exit(0);

	}
}

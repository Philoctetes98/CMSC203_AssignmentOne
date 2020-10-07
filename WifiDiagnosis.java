import java.util.Scanner;

public class WifiDiagnosis {
	public static void main(String[] args) {
		//Create a scanner object
		Scanner keyboard = new Scanner(System.in);
		//Opening message for the Diagnosis program
		System.out.println("If you have a problem with internet connectivity, "
				+ "this WiFi Diagnosis might work.");
		//Tells the user the first step of the diagnosis program
		System.out.println("First step: Reboot your computer");
		System.out.println("Are you able to connect to the Internet?"
				+ " (yes or no)");
		//inputs the answer
		String input = keyboard.nextLine();
		//if rebooting the computer does work, then the wifi issue is fixed
		if (input.equalsIgnoreCase("yes"))
		{
			System.out.println("Rebooting your computer seemed to have fixed the issue."
					+ " Thank you and have a nice day.");
			return;
		}
		//Tells the user the second step of the diagnosis program
		System.out.println("Second step: Reboot the router");
		System.out.println("Now are you able to connect to the Internet?"
				+ " (yes or no)");
		//inputs the answer
		input = keyboard.nextLine();
		//if rebooting the router does work, then the wifi issue is fixed
		if (input.equalsIgnoreCase("yes"))
		{
			System.out.println("Rebooting your router seemed to have fixed the issue."
					+ " Thank you and have a nice day.");
			return;
		}
		//Tells the user the third step of the diagnosis program
		System.out.println("Third step: make sure the cables to your router "
				+ "are plugged in firmly and your router is getting power");
		System.out.println("Now are you able to connect to the Internet?"
				+ " (yes or no)");
		//inputs the answer
		input = keyboard.nextLine();
		//if rebooting the checking router power works, then the wifi issue is fixed
		if (input.equalsIgnoreCase("yes"))
		{
			System.out.println("Checking on the routers seemed to have fixed the issue."
					+ " Thank you and have a nice day.");
			return;
		}
		//Tells the user the fourth step of the diagnosis program
		System.out.println("Fourth step: move the computer closer to the "
				+ " router and try to connect");
		System.out.println("Now are you able to connect to the Internet?"
				+ " (yes or no)");
		//inputs the answer
		input = keyboard.nextLine();
		//if moving the computer closer to the router works, then the wifi issue is fixed
		if (input.equalsIgnoreCase("yes"))
		{
			System.out.println("Moving the computer closer to the router seems to have"
					+ " fixed the issue. Thank you and have a nice day.");
			return;
		}
		//If none of the solutions work, then the user must contact their ISP
		System.out.println("Fifth Step: contact your ISP");
		System.out.println("Make sure your ISP is hooked up to your router.");
	}

}

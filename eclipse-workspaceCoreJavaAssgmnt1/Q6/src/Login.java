import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		int totalAttempts = 2;
		Scanner sc = new Scanner(System.in);

		String username;
		String password;
		while(true) {
		System.out.println("Enter username and pass");
		
		username = sc.nextLine();
		password = sc.nextLine();

		if (totalAttempts != 0) {
			if (username.equalsIgnoreCase("admin") && password .equals("admin")) {
				System.out.println("Welcome");
			} else {
				System.out.println("Incorrent credentials");
				totalAttempts--;
			}

		} else {
			System.out.println("MAx no. of attempts reached bro");
			break;
		}

	}
	}
}

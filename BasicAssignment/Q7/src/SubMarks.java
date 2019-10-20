import java.util.Scanner;

public class SubMarks {
	private static Scanner s;

	public static void main(String[] args) {
		int Sub1, Sub2, Sub3, Result;

		s = new Scanner(System.in);

		System.out.println("Enter Sub1 marks :");
		Sub1 = s.nextInt();

		System.out.println("Enter Sub2 marks :");
		Sub2 = s.nextInt();

		System.out.println("Enter Sub3 marks :");
		Sub3 = s.nextInt();

		Result = Sub1 + Sub2 + Sub3;
		System.out.println("Result of 3 subjects is " + Result);

		if (Sub1 > 60 && Sub2 > 60 && Sub3 > 60) {
			System.out.println("Passed");
		} else if (Sub1 > 60 && Sub2 > 60 || Sub1 > 60 && Sub3 > 60 || Sub2 > 60 && Sub3 > 60) {
			System.out.println("Promoted");
		} else {
			System.out.println("Failed");
		}

	}
}

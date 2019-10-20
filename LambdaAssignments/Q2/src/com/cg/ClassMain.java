package com.cg;

import java.util.HashMap;

public class ClassMain {

	public static void main(String[] args) {

		Check status = (Integer a, String b) -> {

			if (a >= 1000 && b == "ACCEPTED" || b == "COMPLETED") {
				System.out.println("Order Done");
			} else {
				System.out.println("Pending");
			}
			return null;

		};
		
		status.statusCheck(10000, "COMPLETED");
		
	}
}

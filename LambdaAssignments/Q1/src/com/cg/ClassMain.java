package com.cg;

public class ClassMain {

	public static void main(String[] args) {
		Arithmetic addition = (int a, int b) -> a + b;
		System.out.println("addition of a, b is : " + addition.arithmeticOperations(1, 3));

		Arithmetic subtraction = (int a, int b) -> a - b;
		System.out.println("subtraction of a, b is: " + subtraction.arithmeticOperations(4, 1));

		Arithmetic multiplication = (int a, int b) -> a - b;
		System.out.println("subtraction of a, b is: " + multiplication.arithmeticOperations(4, 2));

	}
}

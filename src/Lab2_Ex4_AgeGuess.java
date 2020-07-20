/* Antonio Brown 
 * Programming Fundamentals 
 * Lab 2 
 * 7/18/20
 */


import java.util.Random;
import java.util.Scanner;

public class Lab2_Ex4_AgeGuess {

	public static void main(String[] args) {

		// Declaring variables
		int ageGuess;

		Random gen = new Random();

		int age = gen.nextInt(100);

		// Allowing variable to be used for input information
		Scanner scan = new Scanner(System.in);
		// Creating the question for the user to answer
		System.out.print("Guess Age: ");
		// Creating the field to enter users name
		ageGuess = scan.nextInt();
		// Displays users age
		System.out.print(" The users age guess is : ");
		System.out.println(ageGuess);
		// Displays users age
		System.out.print(" The users age is: ");
		System.out.println(age);

		// Stops scanning for input
		scan.close();

		// creating an if statement to output a message if user is wrong
		if (age != ageGuess) {

			System.out.println("You Guessed Wrong!");
		}

		if (age > ageGuess) {
			
			// if the actual age was greater than the guess it will display older
			System.out.println("Older");
		}

		else {
			
			// if the actual age was less than the guess it will display younger
			System.out.println("Younger");

		}
	}
}

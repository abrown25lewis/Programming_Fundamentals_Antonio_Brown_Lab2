/* Antonio Brown 
 * Programming Fundamentals 
 * Lab 2 
 * 7/18/20
 */

public class Lab2_Ex5_FloatEqu_2 {

	public static void main(String[] args) {

		// Creating my variables and storing the labs equation each in its own unique
		// variable
		double math = (1.0 / 10) * (1.0 / 10);
		double math2 = (1.0 / 100);

		// Setting my tolerance
		double tolerance = 0.000001;

		/*
		 * If Statement has sent the condition that if math is equal to math2 it will
		 * print the code within the brackets
		 */
		if (math == math2) {

			System.out.println("EQUAL");
		}

		// Setting the tolerance allows to test for any unwanted added value to a number
		if (Math.abs(math - math2) < tolerance) {

			System.out.println("Essentially Equal");

		// Executes the below code if no conditions are met above
		} else {

			System.out.println("NOT EQUAL");
		}

	}
}

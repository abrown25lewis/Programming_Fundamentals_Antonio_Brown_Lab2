/* Antonio Brown 
 * Programming Fundamentals 
 * Lab 2 
 * 7/18/20

 	When I initially ran this program i thought that the two variables would equal.
 * When the calculations are done both on a calculator and in excel they are equal.*/


public class Lab2_Ex5_FloatEqu {

	public static void main(String[] args) {
	
		/* Creating my variables and storing the labs equation each in its own unique
		 variable */
		double math = (1.0/10)*(1.0/10);
		double math2 = (1.0/100);
		
		
		/* If Statement has sent the condition that if math is equal to math2 it will
		 * print the code within the brackets */
		if (math == math2) {
			
			System.out.println("EQUAL");
		}
		
		else {
			
			System.out.println("NOT EQUAL");

		}
	}
}


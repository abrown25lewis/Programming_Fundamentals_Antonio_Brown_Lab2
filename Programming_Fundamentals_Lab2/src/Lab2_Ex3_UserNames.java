import java.util.Scanner;                                     
import java.util.Random;      

public class Lab2_Ex3_UserNames {

	public static void main(String[] args) {
		
		// First Name
		String fName;
		//Last Name
		String lName;
		//Abbr First Name
		String afName;
		//Abbr Last Name
		String alName;
		
		//creating random number object
		Random gen = new Random();
		//creating a random number generator from 10 to 99
		int num = 10 + gen.nextInt(89);
		//creating scanner object
		Scanner scan = new Scanner(System.in);
		
		//prompting user to enter first name
		System.out.println("Please enter your first name: ");
		//stores entered name in fName
		fName = scan.next();
		//prompting user to enter last name
		System.out.println("Please enter your last name: ");
		//stores entered name in lName
		lName = scan.next();
		
		//storing the first 4 letters of the last name in alName
		alName = lName.substring(0, 4);
		//storing the first letter of the first name in afName
		afName = fName.substring(0, 1);
		
		System.out.print(alName+afName+num);
		
	}

}

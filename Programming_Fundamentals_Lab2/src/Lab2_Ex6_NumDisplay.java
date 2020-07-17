import java.util.Scanner;

public class Lab2_Ex6_NumDisplay {

	public static void main(String[] args) {
	
		int number;
		
		// Creating Scanner object
		Scanner scan = new Scanner(System.in);
		// prompting the user to enter in number 1 thru 9
		System.out.print("Enter a number 0 - 9 ");
		// Creating the field to enter users number
		number = scan.nextInt();
		
		switch (number) {
		
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		case 8:
			System.out.println("eight");
			break;
		case 9:
			System.out.println("nine");
			break;
		default:
			System.out.println("You have entered a wrong number!");
			
		}
		
		
		
	}

}

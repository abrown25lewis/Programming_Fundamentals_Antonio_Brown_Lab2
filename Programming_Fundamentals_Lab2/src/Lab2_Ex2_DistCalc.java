
//allows the scanner class to be used                                                              
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab2_Ex2_DistCalc {

	public static void main(String[] args) {


			double x1,x2,y1,y2;
			double dist = 0;

		//creating Scanner object  
			Scanner scan = new Scanner(System.in);                
		// Creating (x1,y1)            
			x1 = scan.nextDouble();
			y1 = scan.nextDouble();
		// Creating (x2,y2)                        
			x2 = scan.nextDouble(); 
			y2 = scan.nextDouble();
		// Calculating distance using Math                                        
			dist = (double)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)); 
		
		//setting my decimal to only display number to three decimal points	
		DecimalFormat df = new DecimalFormat("###.###");
			
		// displaying the distance formula with 3 decimal places
			System.out.println("Distance Equals "+ df.format(dist));
				

	}

}

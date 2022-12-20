package susanta;
import java.util.Scanner;
public class Menu_java {
	 public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);  //creating a Scanner object
	 do {
		 //displaying the menu
	        System.out.println("Select your stream from the given below options:");
	        System.out.println("1. Computer Science Engineering");
	        System.out.println("2. Mechanical Engineering");
	        System.out.println("3. Electronics and Communication Engineering");
	        System.out.println("4. Electrical Engineering");
	        System.out.println("5. Civil Engineering");
	 
	        //reading the user's choice
	        int choice = sc.nextInt();
	 
	        //displaying the subjects of the chosen stream
	        switch(choice)
	        {
	            case 1:
	                System.out.println("The subjects in Computer Science Engineering are: ");
	                System.out.println("1. Mathematics");
	                System.out.println("2. Algorithms");
	                System.out.println("3. Theory of Computation");
	                System.out.println("4. Operating Systems");
	                System.out.println("5. Computer Networks");
	                break;
	            case 2:
	                System.out.println("The subjects in Mechanical Engineering are: ");
	                System.out.println("1. Thermodynamics");
	                System.out.println("2. Fluid Mechanics");
	                System.out.println("3. Mechanics of Materials");
	                System.out.println("4. Engineering Design");
	                System.out.println("5. Machine Design");
	                break;
	            case 3:
	                System.out.println("The subjects in Electronics and Communication Engineering are: ");
	                System.out.println("1. Digital Electronics");
	                System.out.println("2. Signals and Systems");
	                System.out.println("3. Analog Electronics");
	                System.out.println("4. Communication Systems");
	                System.out.println("5. Microprocessors and Microcontrollers");
	                break;
	            case 4:
	                System.out.println("The subjects in Electrical Engineering are: ");
	                System.out.println("1. Electrical Machines");
	                System.out.println("2. Power Electronics");
	                System.out.println("3. Control Systems");
	                System.out.println("4. Power System Analysis");
	                System.out.println("5. Digital Electronics");
	                break;
	            case 5:
	                System.out.println("The subjects in Civil Engineering are: ");
	                System.out.println("1. Strength of Materials");
	                System.out.println("2. Structural Analysis");
	                System.out.println("3. Geotechnical Engineering");
	                System.out.println("4. Environmental Engineering");
	                System.out.println("5. Transportation Engineering");
	                break;
	            default:
	                System.out.println("Please enter a valid option!");
	                break;
	        }
	 
	        System.out.println("Are you sure about your choice? (yes/no)");
	        String answer = sc.next();
	 
	        //displaying the appropriate message
	        if(answer.equalsIgnoreCase("yes"))
	        {
	            System.out.println("Congratulations! You have chosen the correct stream.");
	      System.exit(1);
	        }
	        else 
	        {
	            System.out.println("Please select the correct stream from the given options:");
	       }
	        
	} while (true);
	       
	 }
}


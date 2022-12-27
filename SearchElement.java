import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		int i, n;
	// Initializing the array
		int array[] = new int[10];
	// Declaring the scanner class to take user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 elements in array : ");
        // Taking user input for array elements
		for(i=0; i<10; i++)
		{
			array[i] = input.nextInt();
		}
	
    	// Input Value the element to search of the array	
		System.out.println("Enter the element to search : ");
		n = input.nextInt();
	// Taking user input for array elements
		for(i=0; i<10; i++)
		{
			if(array[i] == n)
			{
				System.out.println("Element found at index : " +i);
				break;
			}
		}
		
		if(i == 10)
		{
			System.out.println("Element not found in array");
		}
	// Closing the scanner class
		input.close();		
	}
}
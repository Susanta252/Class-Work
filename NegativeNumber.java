import java.util.Scanner; 

public class NegativeNumber {
  
  public static void main(String[] args) {
    
    // Declaring the scanner class to take user input
    Scanner input = new Scanner(System.in);
    
    // Initializing the array
    int[] array = new int[5];
    
    // Taking user input for array elements
    for (int i = 0; i < array.length; i++) {
      System.out.print("Enter array element: ");
      array[i] = input.nextInt();
    }
    
    // Printing the negetive numbers of the array
    System.out.print("The negetive numbers of the array are: ");
    for (int i = 0; i < array.length; i++) {
      if (array[i] < 0) {
        System.out.print(array[i] + " ");
      }
    }
    
    // Closing the scanner class
    input.close();
  }
  
}
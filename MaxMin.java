import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// User Input
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		System.out.println("Enter "+size+" elements in the array:");
		for(int i=0; i<size; i++) {
			array[i] = sc.nextInt();
		}
		
		// Find max and min elements
		int max = array[0];
		int min = array[0];
		
		for(int i=1; i<size; i++) {
			if(array[i] > max)
				max = array[i];
			if(array[i] < min)
				min = array[i];
		}
		
		System.out.println("Maximum element in the array: "+max);
		System.out.println("Minimum element in the array: "+min);
		
		sc.close();
	}
}
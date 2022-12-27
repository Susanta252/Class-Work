import java.util.Scanner;

public class EvenOddArray {

    public static void main(String[] args) {

        // User inputs the size of the array
        System.out.println("Enter the size of the array: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        // User inputs the elements of the array
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        // Count the number of even and odd elements in the array
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        // Print the result
        System.out.println("Number of even elements: " + countEven);
        System.out.println("Number of odd elements: " + countOdd);
    }
}
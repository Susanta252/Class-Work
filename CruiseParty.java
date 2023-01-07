import java.util.Scanner;
 
public class CruiseParty
{
    public static void main(String[] args)
    {
        int T;   // Value of T
        int[] E; // Elements of E[0] to E[N-1]
        int[] L; // Elements of L[0] to L[N-1]
        int count = 0;
        int max_guests = 0;
        Scanner sc = new Scanner(System.in);
 
        // Get the value of T
        System.out.print("Enter the value of T: ");
        T = sc.nextInt();
 
        // Get the elements of E[0] to E[N-1]
        System.out.println("Enter the elements of E[0] to E[N-1]: ");
        E = new int[T];
        for(int i = 0; i < T; i++)
            E[i] = sc.nextInt();
 
        // Get the elements of L[0] to L[N-1]
        System.out.println("Enter the elements of L[0] to L[N-1]: ");
        L = new int[T];
        for(int i = 0; i < T; i++)
            L[i] = sc.nextInt();
 
        // Find the maximum number of guests
        for(int i = 0; i < T; i++)
        {
            count += E[i] - L[i];
            if(count > max_guests)
                max_guests = count;
        }
 
        // Print the maximum number of guests
        System.out.println("Maximum number of guests on cruise at an instance: "+max_guests);
        sc.close();
    }
}
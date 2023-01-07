// Java program to find difference between
// sum of integers not divisible by n and
// sum of numbers divisible by n
 
public class DifferenceofSum
{
    // Function to find difference between
    // sum of integers not divisible by n and
    // sum of numbers divisible by n
    static int differenceofSum(int n, int m)
    {
        // Sum of integers divisible by n
        int divisibleSum = 0;
 
        // Sum of integers not divisible by n
        int notDivisibleSum = 0;
 
        // Iterating from 1 to m
        for (int i = 1; i <= m; i++)
        {
            // If i is divisible by n
            if (i % n == 0)
            {
                divisibleSum += i;
            }
            // If i is not divisible by n
            else
            {
                notDivisibleSum += i;
            }
        }
 
        // Returning difference between the sum
        return (notDivisibleSum - divisibleSum);
    }
 
    // Driver code
    public static void main(String args[])
    {
        int n = 4;
        int m = 20;
        System.out.println("Difference between sum of integers not divisible by " + n + " and sum of numbers divisible by " + n + " is " + differenceofSum(n, m));
    }
}
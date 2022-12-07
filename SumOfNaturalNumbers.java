import java.util.Scanner;
public class SumOfNaturalNumbers 
{
public static void main(String[] args) 
{
int n, sum = 0;
System.out.println("Enter a number to calculate sum of natural numbers :");
Scanner sc = new Scanner(System.in);
n = sc.nextInt();
for(int i=1; i<=n; i++)
{
sum+=i;
}
System.out.println("Sum of natural numbers upto " + n + " is: " + sum);
}
}
import java.util.Scanner;
import java.util.Scanner;
public class Equal_Integer 
{
public static void main(String[] args) 
    {
	int a, b;
	Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        a = s.nextInt();
        System.out.print("Enter the second number:");
        b = s.nextInt();
        if(a == b)
        {
            System.out.println(a+" and "+b+" are equal ");
        }
        else
        {
            System.out.println(a+" and "+b+" are not equal ");
        }
    }
}
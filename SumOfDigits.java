package susanta;
import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[] args) {
		int num1,sum=0;
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		while(num1!=0)
		{
			int rem=num1%10;
			sum=sum+rem;
			num1=num1/10;	
		}
		System.out.println("sum of digits: "+sum);


	}

}

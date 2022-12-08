package susanta;
import java.util.Scanner;
import java.lang.Math;
public class ReverseOfNumber {
	public static void main(String[] args) {
	int num1,sum=0;
	System.out.println("Enter the number: ");
	Scanner sc=new Scanner(System.in);
	num1=sc.nextInt();
	while(num1!=0)
	{
		int rem=num1%10;
		sum=sum*10+rem;
		num1=num1/10;

}
	System.out.println("reverse number is: "+sum);
}
}

package susanta;
import java.util.Scanner;
public class CountDigit {
	public static void main(String[] args) {
		int num1,count=0;
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		while(num1!=0)
		{
			num1=num1/10;
			count++;
			
		}
		System.out.println("number of digits: "+count);

	}

}

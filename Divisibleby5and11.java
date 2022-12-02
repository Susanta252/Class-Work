import java.util.Scanner;
public class Divisibleby5and11 
{
public static Scanner sc;
public static void main(String[] args) 
{
int a;
sc = new Scanner(System.in);	
System.out.print(" Please Enter a Number : ");
a = sc.nextInt();			
if((a % 5 == 0 && a % 11 == 0))
{
System.out.println("Given Number " + a + " is Divisible by 5 and 11"); 
}
else
{
System.out.println("Given Number " + a + " is Not Divisible by 5 and 11"); 
}	
}
}
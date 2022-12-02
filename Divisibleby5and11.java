import java.util.Scanner;// importing Classes/Files
public class Divisibleby5and11 
{
public static Scanner sc;
public static void main(String[] args) // Main Driver function
{
int a;
sc = new Scanner(System.in);	
System.out.print(" Please Enter a Number : ");
a = sc.nextInt();			
if((a % 5 == 0 && a % 11 == 0))// when divided by 5 and 11
       
{
System.out.println("Given Number " + a + " is Divisible by 5 and 11"); // Print yes if no is divisible by 5 and 11 Both 
}
else
{
System.out.println("Given Number " + a + " is Not Divisible by 5 and 11"); // Print yes if no is not divisible by 5 and 11 Both 
}	
}
}
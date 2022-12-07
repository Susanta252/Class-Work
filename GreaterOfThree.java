import java.util.Scanner;
public class GreaterOfThree 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
int x, y, z;//object of the Scanner class
System.out.println("Enter the first number: ");
x = scanner.nextInt();//reading input from the user 
System.out.println("Enter the second number: ");
y = scanner.nextInt();//reading input from the user 
System.out.println("Enter the third number: ");
z = scanner.nextInt();//reading input from the user 
if(x > y && x > z) //comparing X & Y and X & Z and storing the largest number in a temp variable  
{
System.out.println("The greater number is " +x);
}
else if(y > x && y > z) //comparing Y & X and Y & Z and storing the largest number in a temp variable 
{
System.out.println("The greater number is " +y);//prints the largest number  
}
else 
{
System.out.println("The greater number is " +z);//prints the largest number  
}
}
}
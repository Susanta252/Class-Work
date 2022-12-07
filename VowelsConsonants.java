import java.util.Scanner;
public class VowelsConsonants 
{
public static void main(String[] args) 
{
Scanner input = new Scanner(System.in);
System.out.println("Enter a letter: ");
char letter = input.next().charAt(0);//reading input from the user 
if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')//define the vowels
{
System.out.println("The letter is a vowel");//prints the vowel  
}
else
{
System.out.println("The letter is a consonant");//prints the consonant
}
}
}
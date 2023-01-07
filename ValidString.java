import java.util.Scanner;
public class ValidString {
 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        int numHash = 0;
        int numStar = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '*') {
                numHash++;
            } else if (input.charAt(i) == '#') {
                numStar++;
            }
        }
        int result = numHash - numStar;
        System.out.println("number of * and # are equal Minimum number of characters needed to make the string valid: " + result);
    }
}
import java.util.Scanner;
public class Palidrom_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text");
        String str = sc.nextLine();
        String arr1[] = str.split(" ");
        for (int i = 0; i < arr1.length; i++) {
        StringBuilder strbuil = new StringBuilder(arr1[i]);
        String str2 = String.valueOf(strbuil.reverse());
            System.out.println(arr1[i]);
            System.out.println(str2);
            if (arr1[i].equals(str2)){
                System.out.println("This is a Palindorm String");
            }
            else {
                System.out.println("This is a not Palindorm String");
            }
        }

    }
}

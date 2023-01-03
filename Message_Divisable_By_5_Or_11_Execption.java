import java.util.Scanner;
public class Message_Divisable_By_5_Or_11_Execption {
    static void Divisable_By_5_and_11_ot_not(int a) throws Divisable_By_5_Or_11_Execption{
            if(a%5==0&&a%11==0){
                throw new Divisable_By_5_Or_11_Execption(a+" is divisible by 5 and 11");
            }
            else {
                throw new Divisable_By_5_Or_11_Execption(a+" is not divisible by 5 and 11");
            }
    }
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = sc.nextInt();
            Divisable_By_5_and_11_ot_not(num);
        }catch (Divisable_By_5_Or_11_Execption e){
            System.out.println(e.getMessage());
        }
    }
}

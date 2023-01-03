import java.util.Scanner;
public class Calculator_Simulator {
    public static void main(String[] args) {
            try{
            try{
            try {
                Tax_Calculator tax_cal1 = new Tax_Calculator();
                Tax_Calculator tax_cal2 = new Tax_Calculator();
//              Tax_Calculator tax_cal3 = new Tax_Calculator();
                System.out.println(tax_cal1.calculate_tax("Susanta", true, 20000));
                System.out.println("You have to pay"+tax_cal2.calculate_tax("Susanta", false, 20000));
//                System.out.println("You have to pay"+tax_cal3.calculate_tax(null, true, 5000));
            } catch (Tax_Not_Eligible t) {
                System.out.println(t.getMessage());
            }
            } catch (Country_Valid c) {
                System.out.println(c.getMessage());
            }
            }catch (Employee_Name_Valid emp_name) {
            System.out.println(emp_name.getMessage());
        }
    }
}

import java.util.Scanner;
interface LibraryUser{
    void registersaccount();
    void requestbook();
}

class KidsUser implements LibraryUser{
    String name;
    KidsUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        this.name = sc.nextLine();
    }
    @Override
    public void registersaccount() {
        System.out.println("You have been registered name:"+name);
    }

    @Override
    public void requestbook() {
        System.out.println("These are the kids section books:\n1.Sinchan\n2.Doremon");
        Scanner sc = new Scanner(System.in);
        String book = sc.nextLine();
        if(book.equals("Sinchan")){
            System.out.println("You have got Sinchan");
        }
        else{
            System.out.println("You have got Doremon");
        }
    }
}

class AdultUser implements LibraryUser{
    String name;
    AdultUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        this.name = sc.nextLine();
    }
    @Override
    public void registersaccount() {
        System.out.println("You have been registered name:"+name);
    }

    @Override
    public void requestbook() {
        System.out.println("These are the Adults section books:\n1.Avengers Age of Ultron\n2.Money Heist");
        Scanner sc = new Scanner(System.in);
        String book = sc.nextLine();
        if(book.equals("Avengers Age of Ultron")){
            System.out.println("You have got Avengers Age of Ultron");
        }
        else{
            System.out.println("You have got Money Heist");
        }
    }
}

public class Class_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age<=15) {
            LibraryUser klibu = new KidsUser();
            klibu.registersaccount();
            klibu.requestbook();
        }
        else if (age>=15) {
            LibraryUser Alibu = new AdultUser();
            Alibu.registersaccount();
            Alibu.requestbook();
        }

    }
}
interface Printable{
    void display();
    void fun();
}

class Print implements Printable{

    @Override
    public void display() {
        System.out.println("I am display1");
    }

    @Override
    public void fun() {
        System.out.println("I am fun1");
    }
}

class Message implements Printable{

    @Override
    public void display() {
        System.out.println("I am display2");
    }

    @Override
    public void fun() {
        System.out.println("I am fun2");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Printable ptr1 = new Print();
        Printable ptr2 = new Message();
        ptr1.fun();
        ptr1.display();
        ptr2.fun();
        ptr2.display();
    }
}
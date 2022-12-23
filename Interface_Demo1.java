interface Printable1{
    void display();
    void fun();
}
interface sayble{
    void say();
    void bell();
}
interface Drawable extends Printable{
    void draw();
    void sent();
}

class Print1 implements Drawable,sayble{

    @Override
    public void display() {
        System.out.println("I am display");
    }

    @Override
    public void fun() {
        System.out.println("I am fun");
    }

    @Override
    public void draw() {
        System.out.println("I am draw");
    }

    @Override
    public void sent() {
        System.out.println("I am sent");
    }

    @Override
    public void say() {
        System.out.println("I am say");
    }

    @Override
    public void bell() {
        System.out.println("I am bell");
    }
}
public class Interface_Demo1 {
    public static void main(String[] args) {
        Printable ptr = new Print1();

        Print1 print1 = new Print1();
        print1.display();
        print1.bell();
        print1.draw();
        print1.fun();
        print1.say();
        print1.sent();
    }
}
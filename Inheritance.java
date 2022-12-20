class Parent{
    public void parent_class_method(){
        System.out.println("I am parent class method");
    }
}

class Child extends Parent{
    public void child_class_method(){
        System.out.println("I am child class method");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.child_class_method();
        ch.parent_class_method();
    }
}

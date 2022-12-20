class Addition{
    public void sum(int a,int b){
        System.out.println("a+b = "+ (a+b));
    }

    public void sum(int a,int b,int c){
        System.out.println("a+b+c = "+ (a+b+c));
    }

    public void sum(float a,int b){
        System.out.println("a+b = "+ (a+b));
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        Addition add = new Addition();
        add.sum(20,56);
        add.sum(68,24,15);
        add.sum(4.5f,46);
    }
}

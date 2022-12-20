class Box{
    private int l;
    private int b;
    private int h;
    public void setData(int l,int b, int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public void display(){
        System.out.println("Length "+l+" Breath "+b+" Height "+h);
    }
}
public class Private_modifire {
    public static void main(String[] args) {
        Box box = new Box();
        box.setData(12,15,26);
        box.display();
//        System.out.println(box.l);
    }
}

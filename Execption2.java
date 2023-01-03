public class Execption2 {
    public static void main(String[] args) {
        int [] arr = new int[5];
        try {
            arr[7] = 23;
            System.out.println("result"+arr[7]);
        }catch (Exception E){
            System.out.println("Index out of bound"+E);
        }
    }
}

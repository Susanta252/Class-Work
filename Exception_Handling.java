public class Exception_Handling {
    public static void main(String[] args) {
        int a =3;
        int b =0;
        try {
        System.out.println(a/b);
        }catch (Exception e){
            System.out.println("Divided by Zero this is an "+e);
        }
        System.out.println(a);

//        String a = null;
//        System.out.println(a.length());

//        int a = Integer.parseInt("abc");
//        System.out.println(a);

//        int [] arr = new int[5];
//        arr[10]= 55;
//        System.out.println(arr[10]);


    }
}

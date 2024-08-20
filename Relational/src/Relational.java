
public class Relational {
    public static void main(String[] args) {

//        ------------Simple relational operators-----------------------
//        int a = 5 , b = 10 , c=15;
//        float a = 5.4f , b = 5.5f , c=15;

//        System.out.println(a<b);
//        System.out.println(a<b && a<c);
//        System.out.println(a<b && a>c);
//        System.out.println(a<b || a>c);

//        System.out.println(a<b);

//        --------we have to find Positive and negative numbers-----------
//        int n = 5;
//        int n = -5;
//
//        if(n>=0){
//            System.out.println("Positive number");
//        }else {
//            System.out.println("Negative number");
//        }

//        -------------we have to find maximum number of three in given below--------

        int a=5 , b=15 , c=4;

        if(a>b && a>c){
            System.out.println(a);
        } else if (b>c) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }

    }
}

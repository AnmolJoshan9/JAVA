
public class Printing1 {
    public static void main(String[] args) {

        int x = 10;
//        float y = 125.6f;
        float y = 0.0012f;
        char z = 'A';
        String str1 = "Java Programming";


//        System.out.printf("Hello %d %f %c World\n" , x,y,z);
//        System.out.printf("Hello %o %f %c World\n" , x,y,z);  //O is for octal
//        System.out.printf("Hello %x %f %c World\n" , x,y,z);    //x is for Hexadecimal

//        System.out.printf("Hello %e \n" , y);

//        System.out.printf("Hello %s \n" , str1);

//        System.out.printf("%1$d %1$d %1$d" , x);

//        System.out.printf("%1$d %2$f %1$d" , x , y);

        System.out.printf("%1$d %2$f %3$s" , x , y , str1);


    }
}

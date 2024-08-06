

public class BitwiseDemo {
    public static void main(String[] args) {

//        int x = 10 , y = 6 , z;

//        int x = 0b1010;
//        int y = 0b0110;
//        int z;

//        int x = 0b1;
        int x = 0b1010;
        int y;

        y =~ x;

        System.out.println(String.format("%s" , Integer.toBinaryString(x)));
        System.out.println(String.format("%32s" , Integer.toBinaryString(y)));
        System.out.println(y);


//        z = x|y;
//        z = x^y;

        System.out.println(y);


    }
}


public class Bitwise {
    public static void main(String[] args) {


//        --SWAP TWO NUMBERS WITHOUT THIRD VARIABLE--

//        int a = 10 , b =15;
//
//        a = a^b;
//        b = a^b;
//        a = a^b;
//
//        System.out.println("a is " + a + " b is " + b);


        byte a = 9 , b =12;

        byte c ;

        c = (byte)(a<<4);
        c = (byte)(c|b);

        System.out.println((c&0b11110000) >>4);
        System.out.println((c&0b00001111));

    }
}

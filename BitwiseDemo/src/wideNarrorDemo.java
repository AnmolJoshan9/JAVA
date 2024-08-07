
public class wideNarrorDemo {
    public static void main(String[] args) {

        byte b = 5;
        short s = 120;
        int i = 10;
        long l = 10;
        float f = 10;
        double d = 10;
        char c = 10;
        boolean b1 = true;

//        b = s;                 //not possible

//        s = b;
//        i =b;
//        l=b;
//        f=b;

//        c=b;                   //not possible due to lossy conversion

//        b1 = b;                //not possible due to lossy conversion

        b = (byte)s;
        System.out.println(b);
        i=s;
        l=s;
        f=s;
        d=s;

        i=(int)f;
        f=i;
        d=f;
        f=(float)d;




    }
}

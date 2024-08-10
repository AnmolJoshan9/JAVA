
public class stringPractice {
    public static void main(String[] args) {

        String str1 = "Java Program";
        String str2 = new String("JAVA");
        char c[] = {'H' , 'e' , 'l' ,'l' , 'o'};
//        String str3 = new String(c);
        String str3 = new String(c , 1, 3);   //String index is 1 and ending index is 3 here


        byte b[] = {65,66,67,68};
//        String str4 = new String(b);
        String str4 = new String(b , 1, 2);  //String index is 1 and ending index is 2 here


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

    }
}

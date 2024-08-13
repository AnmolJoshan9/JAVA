
public class Quantifiers {
    public static void main(String[] args) {

//        String str1 = "abcdef";
//        String str1 = "ab6cdef";
//        String str1 = "aBcdef";
//        String str2 = "abcbbccb";
//        String str3 = "acc";
//        String str3 = "accb";
//        String str4 = "john@gmail.com";
        String str4 = "joh-n@gmail.com";



//        System.out.println(str1.matches(".*"));
//        System.out.println(str1.matches("[a-z]*"));
//        System.out.println(str2.matches("[abc]*"));
//        System.out.println(str2.matches("[abc]+"));
//        System.out.println(str3.matches("[abc]{3}"));
//        System.out.println(str3.matches("[abc]{3,7}"));
//        System.out.println(str4.matches(".*gmail.*"));
//        System.out.println(str4.matches("\\w*@gmail.*"));
        System.out.println(str4.matches("\\w*@gmail(.*)"));

    }
}

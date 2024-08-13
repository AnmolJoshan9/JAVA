
public class studentChallengeRegExp1 {
    public static void main(String[] args) {

//        int a = 10110001;
////        String str = a + "";
//        String str1 = String.valueOf(a);
//        System.out.println(str1.matches("[01]*"));

        String str2 = "234AB";
        System.out.println(str2.matches("[0-9A-F]+"));

        String d = "01/12/2000";
        System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
}


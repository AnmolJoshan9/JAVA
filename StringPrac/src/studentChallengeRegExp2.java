
public class studentChallengeRegExp2 {
    public static void main(String[] args) {

        String str = "a!b@c#1$2%3";
        String str1 = str.replaceAll("[^a-zA-Z0-9]" , "");
        System.out.println(str1);


        String str2 = "  abc   de   fgh   ijk  ";
        String str3 = str2.replaceAll("\\s+" , " ").trim();
        String words[] = str3.split("\\s");
        System.out.println(words.length);
    }
}

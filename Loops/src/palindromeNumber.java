import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int m = n;
        int rev=0;
        int r;

        while(n > 0) {

            r = n % 10;
            rev = rev * 10 + r;
            n = n/10;

        }
        if(rev == m) {
            System.out.println("Its is a Palindrome");
        }
        else{
            System.out.println("Its not a Palindrome");
        }
    }
}

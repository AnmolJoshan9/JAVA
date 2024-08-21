import java.util.Scanner;

public class findRadix {
    public static void main(String[] args) {

        //------Radix ka matlab hota hai "base" of a number system.
        // For example, in the decimal system (jo hum daily use karte hain),
        // the radix is 10 because it uses ten digits (0-9).

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        String num = sc.nextLine();

        if(num.matches("[01]+")){
            System.out.println("Binary radix = 2");
        } else if (num.matches("[0-7]+")) {
            System.out.println("Octal radix = 8");
        } else if (num.matches("[0-9]+")) {
            System.out.println("Decimal Radix = 10");
        } else if (num.matches("[0-9A-F]+")) {
            System.out.println("HexaDecimal Radix = 16");
        }
        else {
            System.out.println("Not a number");
        }
    }
}

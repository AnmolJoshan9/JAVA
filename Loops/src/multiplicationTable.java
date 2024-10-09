import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {

//        want to do multiplication here like 5*1= 5


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for(int i = 1; i<=10 ;i++)
        {
            System.out.println(n + "x" + i + "=" + n * i );
        }
    }
}

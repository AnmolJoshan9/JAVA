import java.util.Scanner;

public class youngOrNotYoung {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");

        int age = sc.nextInt();

        if(age>=14 && age<=55){
            System.out.println("You are Young");
        }
        else {
            System.out.println("You are not Young");
        }
    }
}

import java.util.Scanner;

public class maximumElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Elements of an array");
        int n = sc.nextInt();

        int A[] = new int[n];
        System.out.println("Enter " + n + " elements");
        for(int i =0 ; i<n ;i++){
            A[i] = sc.nextInt();
        }

        int max = A[0];
        for(int i=0 ; i<A.length ;i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        System.out.println("The maximum element is: " + max);
    }
}

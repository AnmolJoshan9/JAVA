public class arrayPractice1 {
    public static void main(String[] args) {

        int A[] = new int[10];
        int B[] = {1,2,3,4,5};
        B[1] = 12;

//       In this i have using for Loop here
//        for(int i=0 ; i<A.length ;i++){
//            System.out.println(A[i]);
//        }
//        for(int i=0 ; i<B.length ; i++){
//            System.out.println(B[i]);
//        }

        for(int i=0 ; i<B.length ; i++){
            System.out.println(B[i]++);
        }

//        In this I have using for each loop here

        for(int x : B){
            System.out.println(x);
        }



    }
}

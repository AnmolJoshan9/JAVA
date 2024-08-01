import java.util.*;

public class cuboidDimensions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length , breadth , height;
        int totalArea , Volume;

        System.out.println("Enter length , breadth and height");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        totalArea = 2 * (length * breadth + length * height + breadth * height);
        Volume = length * breadth * height;

        System.out.println("Total Area " + totalArea);
        System.out.println("Volume is " + Volume);
    }
}

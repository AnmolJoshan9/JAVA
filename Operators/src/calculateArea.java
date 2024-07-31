import java.lang.*;
import java.util.*;


public class calculateArea {

    public static void main(String[] args)
    {
        float base , height , area;
        System.out.println("Enter base nad Height ");
        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();

        area = base * height/2;
        System.out.println("Area pf a triangle is " +area) ;
    }

}

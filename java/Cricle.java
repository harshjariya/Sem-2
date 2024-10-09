import java.util.*;
public class Cricle{

    public static double calculateArea (double r) {

        double area =( Math.PI)*r*r;

        return area;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cricle a = new Cricle();

        System.out.println("entre a redius");

        double r = sc.nextDouble();

        double area = calculateArea(r);

        System.out.println(area);

    }


}
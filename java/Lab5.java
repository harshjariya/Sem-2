import java.util.Scanner;
public class Lab5{
	public static void main(String[] args) {
		Area a1 = new Area();
		int r=10;
		double ans = a1.circle(r);
		System.out.println(ans);
	}
}

class Area{
	double circle(double radius){
		return Math.PI*radius*radius;
	}
	
}	

	

	

import java.util.Scanner;
import java.lang.Math;
public class areacir{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		double r=sc.nextDouble();
		double area= Math.PI*r*r;
		System.out.println(area);
	}
}
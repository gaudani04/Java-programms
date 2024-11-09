import java.util.Scanner;
public class q3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1:");
		int a=sc.nextInt();
		System.out.println("Enter num2:");
		int b=sc.nextInt();
		System.out.println("enter operator");
		String operator = sc.next();
		switch(operator){
		case "+":
			System.out.println("addition"+(a+b));
			break;
		case "-":
			System.out.println("sub"+(a-b));
			break;
			default:
				System.out.println("not valid");	
		}

	}
}
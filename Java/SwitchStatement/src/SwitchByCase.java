import java.util.Scanner;
public class SwitchByCase {

	public static void main(String[] args) {
		
		int a=100;
		int b=20;
		System.out.println("Welcome Sir!!! \n How can i help you");
		System.out.println("Enter 1.add 2.sub 3.mul 4.div");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		switch(option)
		{
		case 1:
		{
			System.out.println("Addition "+(a+b));
			break;
		}
		case 2:
		{
			System.out.println("Subtraction "+(a-b));
		    break;
		}
		case 3:
		{
			System.out.println("Multiplication "+(a*b));
			break;
		}
		case 4:
		{
			System.out.println("Division "+(a/b));
			break;
		}
		default:
		{
			System.out.println("Enter valid input");
			break;
		}
		
		}
	}
}

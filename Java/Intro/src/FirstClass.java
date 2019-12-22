import java.util.Scanner;

//this is a class
public class FirstClass
{

 public static void main(String[] args) 
 {
	/*System.out.println("Hello this is my first programme");
	System.out.println("At present i am in Main method of FirstClass ");
	
	SecondClass sc = new SecondClass(); //i have created an onject naming "sc" for second class
	
	sc.display();*/
	
	ThirdClass tc = new ThirdClass();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the ATM Pin to Login");
	int x = sc.nextInt();
	tc.checkValidity(x);
	
	//System.out.println("Came back to FirstClass");
	
	
	
 }
	
}

import java.util.Scanner;


public class SwitchExample2 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
	int i=1;
	while(i>0)
	{
		System.out.println("Enter ur options Good or bad or Somewhat");
		String option =sc.next();
	 switch(option)	
	 {
		 case "Good" :
			 {
				 System.out.println("Your classes are good");
			   break;
			 }
		 case "bad":
		 {
			 System.out.println("your classes are not that good");
		     break;
		 }
		 
		 case "Somewhat":
		 {
			 System.out.println("somewhat good");
		     break;
		 }
		 
		 default:
		 {
			 System.out.println("No Comments");
			 i=-5;
			 break;
		 }
	 }
	 
	 
	}
	}

}

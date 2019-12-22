import java.util.Scanner;


//we have 3 chances to unlock our phone, if not it will be locked

public class PhoneUnlock {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	for(int i=1;i<=3;i++)
	{
		System.out.println("Enter the password \n your attempt no "+i);
		String userInput = sc.next();
		if(userInput.equals("pass@123"))
		{
			System.out.println("Welcome");
			break;
		}
		else
		{
			if(i==3)
			{
				System.out.println("You have entered wrong password more than 3 times");
				System.out.println("Your phone is locked");
			}
			else
			{
			System.out.println("Incorrect Password, you have "+(3-i)+" chances left");
			}
		}
			
	}
}
}



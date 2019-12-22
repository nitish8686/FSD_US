import java.util.Scanner;

/*
  Create a programme to Check Weather you are eligible to Work or Not.
  
   a> Should be more than 22 yrs of Age.
   b> Should be a graduate.
   c> Should have basic knowledge of Java.
  
   Required :
   1. inputs--> age,education,Knowledge
   2.Evaluate
   3. Delclare the result..
   
 */
public class CheckEligiblity 
{

	//I need something so that i can pass my inputs directily....
	//to get inputs we have something calles SCANNER CLASS.

int age;
String education;
String knowledge;
 public void getInputs()
 {

Scanner sc = new Scanner(System.in);
System.out.println("Enter your Age :"); 
 age = sc.nextInt();
System.out.println("Enter your Qualification");
education = sc.next() ;
System.out.println("Enter your Knowledge"); 
 knowledge = sc.next() ;
}
	
 public void check()
 {
	System.out.println("Your Age is "+age);
	System.out.println("Your Education was "+ education);
	System.out.println("Your Knowledge was "+knowledge);
	 
	if(age >= 22 && education.equalsIgnoreCase("Graduate") && knowledge.equals("Java"))
	{
		System.out.println("You Qualify to Work!!!!");
	}
	else
	{
		System.out.println("Sorry!!! you didnt qualify");
	}
	 
	 
 }
 
 
}

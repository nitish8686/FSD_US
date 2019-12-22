
public class Exceptions {

	
	public static void main(String[] args)
	{
	
	 try
	 {
		  int a=100;
		  int b = 0;
		   System.out.println(a/b); 
	 }
	 catch(ArithmeticException ae)
	 {
		 System.out.println("It is an Arithmetic Exception in");
		// ae.printStackTrace();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 finally
	 {
		 System.out.println("Enterd the finally block ");
	 }
	
	}
}

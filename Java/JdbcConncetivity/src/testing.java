
public class testing {

	public static void main(String[] args) {
		sample s = new sample();
		boolean str1=sample.test("(hsidfksdf(gsd)");
	 
	  system.out.println(""+str1);
	}
}

class sample
{
	public static boolean test(String field)
	{
		if(field.endsWith("("))
			return true;
		else
			return false;
	}
	
	public static boolean test1(String field)
	{
		try
		{
			boolean bracketsFound = true;
			for(int i=0; i<field.length();i++)
			{
				if(field.charAt(i)=='(')
				{
					bracketsFound=true;
				break;
				}
				else
				{
					bracketsFound= false;
				}
			}
			return bracketsFound;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
}
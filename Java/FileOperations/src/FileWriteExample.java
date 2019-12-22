import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileWriteExample {

	public static void main(String[] args) throws IOException {
		
	 try 
	 {
		
		 FileOutputStream  fos = new FileOutputStream("D:\\output.txt",true);
	     String abc="Hello this is Four line of the file\n";
	     byte b[]=abc.getBytes();
	     fos.write(b);
	     fos.close();
	     System.out.println(abc);
	 } 
	 catch (Exception e) 
	 {
	
		e.printStackTrace();
	 }
	 
	}
}



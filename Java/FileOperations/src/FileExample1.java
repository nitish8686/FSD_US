import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class FileExample1 {

	
	 public static void main(String args[]){    
         try{    
	           FileInputStream fin=new FileInputStream("null");
	           
	           int i=0;    
	           while((i=fin.read())!=-1)//(read_the_date untill u reach the end of file)
	           {    
	            System.out.print((char)i);    
               }    
	           fin.close();    
            }
         catch(Exception e)
         {
        	 System.out.println(e);}    
        }    
	
}


//FileNotFoundException
//
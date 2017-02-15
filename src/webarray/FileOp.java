package webarray;
 
import java.lang.*;
import java.lang.Thread;

public class FileOp {
    public int num =0;
    public long time = 2;
    private String filename;
    private String opstring;
    
 
    public FileOp(String f,String op)
    {
    	filename = f;  	
    	opstring = op;
    }
 
    public synchronized String fileOpDo() {

    	System.out.println("open luntable file ");
    	  try {
              Thread.sleep(2000);

    	      System.out.println("Processing op:" +opstring);
    	  
    	  } catch (InterruptedException e) {
              e.printStackTrace(); 
          }
    	System.out.println("close luntable file");
    	
    	return opstring;
    }
}

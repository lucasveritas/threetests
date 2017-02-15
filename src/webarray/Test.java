package webarray;
 
public class Test {
	public static void main(String[] args)   
	{
     		
		ArrayLunOp alo = new ArrayLunOp();
		try {
		String info = alo.createLun(100);
		System.out.println(info);
		
		java.lang.Thread.sleep(4000); 	
		
		info = alo.getLunInfo("lun1");
		System.out.println(info);
		
		java.lang.Thread.sleep(4000); 
		
		info = alo.createMultiLun(2, 100);
		System.out.println(info);
		
		java.lang.Thread.sleep(4000); 
		
		info = alo.getLunInfo("lun2");
		System.out.println(info);
		
		java.lang.Thread.sleep(4000); 
		
		info = alo.resize("lun1", 200);
		System.out.println(info);
		
		java.lang.Thread.sleep(4000); 
		
		info =  alo.removeLun("lun2");
		System.out.println(info);
		
		}catch(Exception e){System.out.println("Hit error");}
		
		
		
		
	}

}

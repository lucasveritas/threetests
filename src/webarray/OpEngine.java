package webarray;

public class OpEngine {
	
	private static String lunTableFile = "e:\\xj\\dev\\luntable";
  	
	
    private static OpEngine instance = null;
    
    
    public static synchronized OpEngine getInstance(){
        if(instance==null){
            instance = new OpEngine();
        }
        return instance;
    }
    
	public String doOper(String ops) {	
		FileOp fo = new FileOp(lunTableFile,ops);
 
        fileThread ft = new  fileThread(fo);
        Thread t = new Thread(ft);
        t.start();
		return "ok";
	}
	
}
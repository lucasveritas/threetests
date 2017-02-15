package webarray;

public class fileThread implements Runnable {
	
	public FileOp fo;
	
	public fileThread(FileOp f) {
		fo = f;
	}
	
	@Override
	public void run() {
		//while(true) {
			String val = fo.fileOpDo();
			if(val != "") {
				//System.out.println(val + " is the res");
			}
		//}
	}
}
 

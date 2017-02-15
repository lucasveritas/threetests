package webarray;

public class ArrayLunOp {
	private String luns;
	private int remainsize;
	private String luntable;
	
	private OpEngine oe = OpEngine.getInstance();
	
	//contents format like below of luntable file
	//luns_max_num=100
	//total_size=1000M
	//max_size=1000M 
	//
	//lun_no=1 lun_name=lun1 lun_size=100M  
	//lun_no=2 lun_name=lun2 lun_size=100M  
	//
	
	public String createLun(int size) {
		oe.doOper("createlun---"+size);
		return "done";
	}

	public String createMultiLun(int num, int size) {
		oe.doOper("createmullun---"+num+"---"+size);
		return "done";
	
	}
	
	public String removeLun(String lunname) {
		oe.doOper("removelun---"+lunname);
		return "done";
	}
		
	public String getLunInfo(String lunname) {
		String info = oe.doOper("getinfo---"+lunname);
		return "lun info: "+info;
	}
	
	public String resize(String lunname, int size) {
		oe.doOper("resizelun---"+lunname+"---"+size);
		return "done";
	}
	
}

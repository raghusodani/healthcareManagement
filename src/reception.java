
public class reception {
	
	private int register_id;
	private String register_name;
	private int charges;
	
	
	public reception(String regname,int regid,int pay) {
		register_id=regid;
		register_name=regname;
		charges=pay;
	}

	
	
	public int payment(int paid) {
		if(paid==charges) 
			{ System.out.println("payment successful");}
		else
			System.out.println("payment unsuccessfull");
		
		return paid;
	
	}
   
	public void report() {
		
	}
	
	public void invite_doctor() {
		
	}

	
	
}
	
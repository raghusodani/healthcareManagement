 class doctor extends person{
			 private int doctor_id;
			 private boolean doctor_status;
			 int charges;
			 public doctor(String n,String gen,int cont,int a) {
				 super(n,gen,cont,a);
			 }
			 
			 public doctor(String n,String gen,int cont,int a,int id,boolean stat,int c) {
				 super(n,gen,cont,a);
				 doctor_id=id;
				 doctor_status=stat;
				 charges = c;
				 }
			 
			 
			
			 
			 public boolean getAvailability() {
				 return doctor_status;
			 }	
			 public void check_report() {
					 
				}
	  
	  
	  }
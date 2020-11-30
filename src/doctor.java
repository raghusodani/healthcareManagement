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
			 public int check_report(report[] a) {
				 //here we keep report 0 or 1 as in 0 is fatal or 1 is healthy
					 a[0].measure = (int) Math.floor(Math.random()*2); 
					 a[1].measure =  (int) Math.floor(Math.random()*2);
					 a[2].measure =  (int) Math.floor(Math.random()*2);
					 a[3].measure =  (int) Math.floor(Math.random()*2);
					 //if there is only covid patient and not an other fatal he can go for home isolation 
					 if(a[0].measure>0) {
						 if(a[1].measure>0 || a[2].measure>0 || a[3].measure>0) {
							 //if covid+fatal = isolation ward in hospital
							 return 0;
						 }
						 else
							 return 1;
					 }
					 else {
						 if(a[1].measure>0 || a[2].measure>0 || a[3].measure>0) {
							 //if only fatal then normal ward where danger of covid is less
							 return 2;
						 }
					 }
					return 0;
				}
	  
	  
	  }
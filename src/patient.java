 class patient extends person{
			private int patient_id;
			private boolean covid;
			private String blood_group;
		
			
			
			public patient(String n,String gen,int cont,int a,String blood){
				super(n,gen,cont,a);
				
				blood=blood_group;	
			}	
			public String getBloodGroup() {
				return blood_group;
			}
			
			public  boolean getCovidStatus() {
				return covid;
			}
	
		}
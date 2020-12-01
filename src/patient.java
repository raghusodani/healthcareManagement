 class patient extends person{
			//private int patient_id;
			private boolean covid;
			private String blood_group;
			private int status;//0-->isolation ; 1-->home ; 2-->normal ward
		
			
			
			public patient(String n,String gen,int cont,int a,String blood){
				super(n,gen,cont,a);
				blood_group = blood;	
			}	
			
			public int getStatus() {
				return status;
			}
			public void setStatus(int status) {
				this.status = status;
			}

			public String getBlood_group() {
				return blood_group;
			}

			public void setBlood_group(String blood_group) {
				this.blood_group = blood_group;
			}
			
			
	
		}
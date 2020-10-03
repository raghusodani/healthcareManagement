


	  class person{
			private  String name;
			private  int contact_no;
			private String gender;
			private int age;
			
			
			
			public person(String n,String gen,int cont,int a) {
				name=n;
				gender=gen;
				
				contact_no=cont;
				age=a;
			}
			
			public  String getName() {
				return name;
			}
			
			public int getContact() {
				
				return contact_no;
			}
			
			public String getGender() {
				return gender;
			}
			
			public int getAge() {
				return age;
			}
			
			
			
			
			
		}
		
		
		 
	  
	  
	  class doctor extends person{
			 private int doctor_id;
			 private boolean doctor_status;
			 
			 
			 public doctor(String n,String gen,int cont,int a,int id,boolean stat) {
				 super(n,gen,cont,a);
				 doctor_id=id;
				 doctor_status=stat;
				 }
			 
			
			 
			 public boolean getAvailability() {
				 return doctor_status;
			 }
			 
			 public String getName() {
					return super.getName();
				}
				
				public int getContact() {
					return super.getContact();
				}
				
				public String getGender() {
					return super.getGender();
				}
				
				public int getAge() {
					return super.getAge();
				}
				
				
				public void check_report() {
					 
				}
	  
	  
	  }
	  
	       class patient extends person{
			private int patient_id;
			private boolean covid;
			private String blood_group;
			private int height;
			private int weight;
			
			
			public patient(String n,String gen,int cont,int a,boolean cov,String blood,int h,int w){
				super(n,gen,cont,a);
				covid=cov;
				blood=blood_group;
				h=height;
				w=weight;
				
			}
			
			
			public String getName() {
				return super.getName();
			}
			
			public int getContact() {
				return super.getContact();
			}
			
			public String getGender() {
				return super.getGender();
			}
			
			
			
			public String getBloodGroup() {
				return blood_group;
			}
			
			public  boolean getCovidStatus() {
				return covid;
			}
			
			public int getHeight() {
				
				return height;
			}
			
			public int getWeight() {
				return weight;
			}
			 
			public int getAge() {
				return super.getAge();
			}
		       public bool reports_all(){
		       
		       }
			
			
		}
		 
		
		 


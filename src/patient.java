import reception.patient;

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
	 
		public static void main(String[] args) {
			patient raghu=new patient("raghu","male",1,2,true,"A+",1,1);
			
				System.out.println(raghu.getName());
				
			}
	 
	 }
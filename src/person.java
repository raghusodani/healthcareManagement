

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
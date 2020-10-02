
public class Test {

	public static void main(String[] args) {
		
		patient a=new patient("xyz","male",12345,21,true,"Aedk",178,45);
		doctor b=new doctor("abc","male",14566,45,9999,true);
		
		
	   System.out.println(a.getName());
	   System.out.println(b.getName());
	   System.out.println(b.getAvailability());
	   System.out.println(a.getCovidStatus());
	   System.out.println(a.getGender());
	}

}

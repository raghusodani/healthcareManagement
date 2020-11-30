
public class receptionist extends person {
	 private int id;
	 public receptionist(String n,String gen,int cont,int a,int i){
		 super(n,gen,cont,a);
	 
		 id = i;
	 }
	 boolean check_room_availability(hospitals a) {
		 if(a.getAvailable_rooms()>0) {
			 return true;
		 }
		 else
			 return false;
	 }
	 void book_room(hospitals a) {
		 if(check_room_availability(a))
			 a.setAvailable_rooms(a.getAvailable_rooms() - 1);
		 else
			 System.out.println("room not available");
	 }
	 
	 void generate_bill() {
		 
	 }
	 
}




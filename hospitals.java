public class hospitals{
	 private int number_of_available_rooms;
	 private int isolation_ward;
	
	 public hospitals(int nr,int iw) {
		number_of_available_rooms=nr;
	   setIsolation_ward(iw);
		
	}
	
	
	public void book_isolation_ward() {
		setIsolation_ward(getIsolation_ward() - 1);
		number_of_available_rooms--;
	}
	
	public void book_normal_ward() {
		number_of_available_rooms--;
	}
	public int getIsolation_ward() {
		return isolation_ward;
	}
	public void setIsolation_ward(int isolation_ward) {
		this.isolation_ward = isolation_ward;
	}
	}
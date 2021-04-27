package assignments.assignment8;

public class Q16 {

	public static void main(String[] args) {
		
		/*
		To book a room first it needs to be available for rent and make sure its available at the date selected:

		the room is already booked between 7/1/2018 - 7/8/2018 and not available accepting bookings only for year of 2018
		
		example:
		
		simpleRoomBook(false,2,1,2018)
		return false
		
		simpleRoomBook(true,2,1,2018)
		return true
		
		simpleRoomBook(true,7,2,2018)
		return false
		 */
		
		System.out.println(simpleRoomBook(false, 2, 1, 2018));
		System.out.println(simpleRoomBook(true, 2, 1, 2018));
		System.out.println(simpleRoomBook(true, 7, 2, 2018));

	}
	
	public static boolean simpleRoomBook(boolean isBooked, int month, int day, int year) {
		
		if(isBooked == true) {
			if (year==2018) {
			    if(month == 7) {
				     if(day==1 || day==2 || day==3 || day==4 || day==5 || day==6 || day==7 || day==8){
					      return false;
				     }else {
				    	 return true;
				     }
			    }else {
			    	return true;
			    }
		    }else {
		    	  return false;
		    }
		  }else {
			  return false;
		  }
		
		
	}

}
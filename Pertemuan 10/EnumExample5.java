class EnumExample5{

	enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
	SATURDAY}
 
 	public static void main(String args[]){
 		Day day=Day.MONDAY;
 		
 		switch(day){
 			case SUNDAY: System.out.println("sunday");
 			break;
 			case MONDAY: System.out.println("monday");
 			break;
 			default:
 			System.out.println("other day");
 		}
 	}
}

/**
 * line 3 = enum variabel day
 * line 7 = deklarasi variabel day Monday dengan type data Day 
 * line 9-15 = Switch case, karena day berupa monday maka dijalankan case di line 12
 */
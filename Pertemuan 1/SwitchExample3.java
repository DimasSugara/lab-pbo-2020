public class SwitchExample3 {
	public static void main(String[] args) { 
		String dayOfWeekArg = "Thursday"; 
		String typeOfDay = "";

		switch (dayOfWeekArg) {
		    case "Monday":
			    typeOfDay = "Start of work week";
			    break;

		    case "Tuesday":
		    case "Wednesday":
		    case "Thursday":
			    typeOfDay = "Midweek";
			    break;

		    case "Friday":
			    typeOfDay = "End of work week";
			    break;

		    case "Saturday":
		    case "Sunday":
			    typeOfDay = "Weekend";
			    break;
	
		    default:
			    System.out.println("Invalid day of the week: " + dayOfWeekArg);
		}
		System.out.println(typeOfDay);
	}
}

/**
 * line 6 = menggunakan operator switch case, dimana jika dayOfWeekArg yang dimasukkan sesuai dengan salah satu case. maka akan menjalankan perintah dari case yang bersangkutan
 * line 7 = case apabila dayOfWeekArg berisi Monday, maka akan menampilkan Start of work week dan break program
 * line 11, 12, 13 = case apabila dayOfWeekArg berisi Thursday, maka akan menampilkan Midweek dan program di break
 * line 17 = case apabila dayOfWeekArg berisi Friday, maka akan menampilkan End of work week dan program di break
 * line 21, 22 = case apabila dayOfWeekArg berisi Sunday, maka akan menampilkan Weekend dan program di break
 * line 26 = apabila tidak ada satupun case yang cocok maka akan menjalankan code default yaitu menampilkan Invalid day of the week dan isi dayOfWeekArg
 * karena pada case di line 13 sama dengan nilai dayOfWeekArg maka nilai output diambil dari typeOfDay Midweek
 */
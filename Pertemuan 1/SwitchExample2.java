public class SwitchExample2 {
	public static void main(String[] args){ 
		int number=20;

		switch(number){
		    case 10: System.out.println("10");
		    case 20: System.out.println("20");
		    case 30: System.out.println("30"); 
		    default: System.out.println("Not in 10, 20 or 30"); 
		}
	}
}

/**
 * sama seperti program sebelumnya, namun disini program tidak akan berhenti dan akan menampilkan nilai 20 saja 
 * namun semua perintah yang ada di setiap case akan ditampilkan
 */
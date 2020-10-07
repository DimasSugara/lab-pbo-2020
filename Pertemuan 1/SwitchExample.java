public class SwitchExample 
{
	public static void main(String[] args) 
	{ 
		int number=20;

		switch(number){
		case 10: System.out.println("10");break;
		case 20: System.out.println("20");break;
		case 30: System.out.println("30");break; 
		default:System.out.println("Not in 10, 20 or 30"); 
		}
	}
}

/**
 * line 7 = menggunakan operator switch case, dimana jika number yang dimasukkan sesuai dengan salah satu case. maka akan menjalankan perintah dari case yang bersangkutan
 * line 8 = jika nilai number adalah 10 maka akan menampilkan 10 dan break program
 * line 9 = jika nilai number adalah 20 maka akan menampilkan 20 dan break program
 * line 10 = jika nilai number adalah 30 maka akan menampilkan 20 dan break program
 * line 11 = jika nilai number tidak ada yang sesuai dengan case yang tersedia, maka secara otomatis menjalankan default yakni output Not in 10, 20 or 30
 * pada line 9 dimana case 20 adalah nilai yang sama dengan nilai number(20) maka tampilan akan muncul 20 dan menjalankan perintah break
 */
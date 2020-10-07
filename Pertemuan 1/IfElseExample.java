public class IfElseExample {	
	public static void main(String[] args) {
		int number=13;

		if(number%2==0) { 
			System.out.println("Angka genap"); 
		}
		else{ 
			System.out.println("Angka ganjil");

		}
	}
}

/**
 * line 5 =menggunakan sistem operator if, apabila sisa dari pembagian antara nilai number dengan 2 adalah 0, maka akan menjalankan perintah print Angka genap
 * line 8 = menggunakan sistem operator else, apabila sisa dari pembagian antara nilai number dengan 2 selain 0, maka akan menjalankan perintah print Angka ganjil
 * karena number(13 di line 3), maka akan menampilkan Angka ganjil sesuai line 8
 */
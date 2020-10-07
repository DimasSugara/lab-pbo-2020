import java.util.Scanner;

public class IfExample {	
	public static void main(String[] args) { 
		int age=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukkan umur anda:"); 
		age = sc.nextInt();
		
		if(age>=17)
			System.out.print("Anda sudah boleh buat KTP");
	}
}

/**
 * line 8, 9 = meminta user untuk memasukkan umur user 
 * line 11 = menggunakan operator if yang apa bila age lebih besar sama dengan 17 maka akan menjalankan perintah if tersebut
 * 			 kalau tidak sesuai maka langsung close program
 */
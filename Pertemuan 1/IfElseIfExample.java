public class IfElseIfExample {
	public static void main(String[] args) { 
		int marks=65;
		
		if(marks<50){ 
			System.out.println("fail");
		}
		else if(marks>=50 && marks<60){ 
			System.out.println("D grade");
		}
		else if(marks>=60 && marks<70){ 
			System.out.println("C grade");
		}
		else if(marks>=70 && marks<80){ 
			System.out.println("B grade");
		}
        else if(marks>=80 && marks<90){ 
			System.out.println("A grade");
		}
		else if(marks>=90 && marks<100){ 
			System.out.println("A+ grade");
		}
		else{
			System.out.println("Invalid!");
		}
	}
}

/**
 * menggunakan operator if else if, yang mana jika sesuai kondisinya maka akan menjalankan perintah di if tersebut
 * line 5 = jika nilai marks lebih kecil dari 50 maka akan menjalankan perintah print fail
 * line 8 = jika nilai marks lebih besar sama dengan 50 dan lebih kecil dari 60 maka akan menjalankan perintah D grade
 * line 11 = jika nilai marks lebih besar sama dengan 60 dan lebih kecil dari 70 maka akan menjalankan perintah C grade
 * line 14 = jika nilai marks lebih besar sama dengan 70 dan lebih kecil dari 80 maka akan menjalankan perintah B grade
 * line 17 = jika nilai marks lebih besar sama dengan 80 dan lebih kecil dari 90 maka akan menjalankan perintah A grade
 * line 20 = jika nilai marks lebih besar sama dengan 90 dan lebih kecil dari 100 maka akan menjalankan perintah A+ grade
 * line 23 = jika nilai marks yang di input tidak termasuk ke satu pun case, maka akan menjalankan perintah print Invalid!
 * karena marks bernilai 65 maka akan menampilkan C grade sesuai kondisi if di line 11
 */
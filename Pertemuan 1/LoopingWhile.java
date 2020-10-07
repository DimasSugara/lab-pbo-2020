public class LoopingWhile{
	public static void main(String arg[]){
		int i=0;
		while (i<10){
			int j=0;
			while (j<i+1){
			    System.out.print('*');
			    j++;
			}
			System.out.println();
			i++;
		}
	}
}

/**
 * line 4 = menggunakan operator while untuk melakukan perulangan sebanyak kurang dari 11 kali dimana i = 0
 * line 6 = menggunakan while untuk melakukan perulangan samapai batas maksimum dari while di line 4
 * disini pada setiap baris akan di tampilkan * sesuai jumlah j
 * contoh disaat nilai j = 4
 * 		*
 * 		**
 * 		***
 * 		****
 */
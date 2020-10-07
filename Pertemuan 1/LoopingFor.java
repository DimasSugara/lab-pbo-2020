public class LoopingFor{
	public static void main(String arg[]){
		for (int i=0; i<10; i++){
			for (int j=0; j<i+1; j++)
		    System.out.print('*');
		    System.out.println();
		}
	}
}

/**
 * line 3 = looping pertama
 * line 4 = looping di dalam looping
 * disini akan menampilkan * sesuai nilai j pada setiap baris sampai batas maksimum looping pertama
 * contoh disaat nilai j = 3
 * 		*
 * 		**
 * 		***
 */
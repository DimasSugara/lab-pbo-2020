public class prak3Lat7 {
	public static void main(String args[]) {
		String name = "James";
		
		boolean result = name instanceof String; 
		System.out.println( result );
	}
}

/**
 *  line 5 =menggunakan operator Instanceof yang digunakan untuk mengecek 
 			apakah suatu objek termasuk ke dalam class tertentu atau tidak. Nilai yang dikembalikan 
 			adalah nilai boolean. Karena name bertipe string maka TRUE
 */
public class ArrayMultiDimensi {
 	
 	public static void main(String[] args) {
 	
 		String[][] provinsi = new String[3][2];
 		provinsi[0][0] = "Aceh";
 		provinsi[0][1] = "Banda Aceh";
 		provinsi[1][0] = "Maluku Utara";
 		provinsi[1][1] = "Sofifi";
 		provinsi[2][0] = "Papua Barat";
 		provinsi[2][1] = "Manokwari";
 
 		for (int i = 0; i < provinsi.length; i++) {
 			StringBuilder sb = new StringBuilder();
 			sb.append("Ibukota ")
 			.append(provinsi[i][0])
 			.append(" adalah ")
 			.append(provinsi[i][1])
 			.append(".");
 			System.out.println(sb);
 		}
 	}
} 

/**
 * line 5-11 = deklarasi dan pemberian nilai ke indeks array povinsi
 * line 13 = terjadi array multi dimensi, dimana provinsi indeks awalnya adalah [0][0]
selanjutnya untuk indeks awal provinsi adalah [0][1] maka akan menghasilakn output pada indeks 
tersebut untuk output selanjutnyanya akan di incremetkan i.
 */


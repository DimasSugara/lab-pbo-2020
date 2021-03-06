public class Array1{
 	public static void main(String[] ar){
 		//deklarasi dan inisialisasi array
 		int[] bil_bulat = {3, 5, 7};
 		String[] warna = {"merah", "hijau", "kuning"};
 		//menampilkan array
 		for(int i=0;i<bil_bulat.length;i++){
 			System.out.print(bil_bulat[i] +" ");
 		}
 		System.out.println();

 		for(int i=0;i<warna.length;i++){
 			System.out.print(warna[i] +" ");
 		}
 		System.out.println();

 		//deklarasi dan inisialisasi array 2D
 		int arr[][]={{1,2,3},{3,4,5},{5,6,7}};

 		//menampilkan array 2D 
 		for(int i=0;i<3;i++){
 			for(int j=0;j<3;j++){
 				System.out.print(arr[i][j]+" ");
 			}
 			System.out.println();
 		}
 	}
} 

/**
 * Array merupakan Objek kontainer/ penampung yang memiliki tipe data yang sama. Array juga berupa
struktur data yang menyimpan elemen yang sama berbasis indeks(index). Elemen pertama sebuah array
memiliki indeks 0 dan elemen terakhirnya n-1 dimana n adalah jumlah elemen di dalam array. 
 * line 7 & 12 = menghasilkan array satu dimensi
 * line 18-26 = menghasilkan array dua dimensi digunakan untuk mewakili matriks
 */
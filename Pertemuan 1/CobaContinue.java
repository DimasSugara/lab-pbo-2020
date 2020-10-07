public class CobaContinue{
	public static void main(String arg[]){
		for (int i=0; i<10; i++){
			for (int j=0; j<i+1; j++){
			    if(j==5)
                continue;
                
			    System.out.print('*');
			}
			System.out.println();
		}
    }
}

/**
 * line 3 = looping pertama
 * line 4 = looping didalam looping
 * line 5 = menggunakan operator if apabila nilai j sama dengan 5 dan dimulai dari j = 5 dan akan continue sampai looping pertama mencapai batas dan menampilkan * sebanyak j
 * output yang dihasilkan meningkat sesuai j
 * contoh bila j=7 maka :
 * 		*
 * 		**
 * 		***
 * 		****
 * 		***** akan dilanjutkan ke looping pertama menjadi 
 * 		***** dan baru dilanjutkan output tambahan
 * 		******
 */
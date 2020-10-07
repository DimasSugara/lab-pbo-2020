public class LoopingDoWhile{
	public static void main(String arg[]){
		int i=0;
        do{
            int j=0;
			while (j<i+1){
			    System.out.print('*');
			    j++;
			}
			System.out.println();
			i++;

        } while (i<10);
	}
}

/**
 * line 4 = menggunakan operator do untuk melakukan perulangan sebanyak jumlah yang tidak ditentukan
 * line 6 = looping nilai j sampai mencapai maksimum jumlah i pada line 13, dan akan diisi nilai * sesuai jumlah nilai j
 * line 13 = batas maksimal untuk nilai i yakni kurang dari 10 atau 9
 * contoh disaat nilai j = 3
 * 		*
 * 		**
 * 		*** 
 */
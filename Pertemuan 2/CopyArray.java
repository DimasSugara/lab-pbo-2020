public class CopyArray {
    public static void main(String args[]) {
        int[] array1 = { 7, 4, 8, 1, 4, 1, 4 };
        int[] array2 = new int[3];

        System.arraycopy(array1,0,array2,0,3);
        System.out.print("Array1 : ");
        for (int i=0; i<array1.length; i++)
            System.out.print(array1[i] + " ");
        System.out.println();

        System.out.print("Array2 : ");
        for (int i=0; i<array2.length; i++)
            System.out.print(array2[i] + " ");
    }
}

/**
 * line 6 = mengcopy nilai array1 mulai dari array1[0] ke nilai array2 sebanyak 3 kali alias 
 *          array[0] ke array2[0]
 *          array[1] ke array2[2]
 *          array[2] ke array2[2]
 * line 7 = menampilkan Array1 : ke layar
 * line 8 = looping sampai batas array1
 * line 9 = menampilkan nilai dari array1 sesuai i dan ditambah spasi sesudahnya
 * line 10 = untuk memindahkan output selanjutnya ke baris baru (sama seperti \n di bahasa C)
 * line 12 = menampilkan Array2 : ke layar
 * line 13 = looping sampai batas array2
 * line 14 = menampilkan nilai dari array2 sesuai i dan ditambah spasi sesudahnya
 */
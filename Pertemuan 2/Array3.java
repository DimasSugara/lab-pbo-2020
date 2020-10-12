public class Array3 {
    public static void main(String args[]) {
        int[][] arrx = new int[3][3];
        arrx[0][0] = 1;
        arrx[0][1] = 2;
        arrx[0][2] = 3;
        arrx[1][0] = 4;
        arrx[1][1] = 5;
        arrx[1][2] = 6;
        arrx[2][0] = 7;
        arrx[2][1] = 8;
        arrx[2][2] = 9;
        System.out.println("Nilai arrx[0][0] : " + arrx[0][0]);
        System.out.println("Nilai arrx[0][1] : " + arrx[0][1]);
        System.out.println("Nilai arrx[0][2] : " + arrx[0][2]);
        System.out.println("Nilai arrx[1][0] : " + arrx[1][0]);
        System.out.println("Nilai arrx[1][1] : " + arrx[1][1]);
        System.out.println("Nilai arrx[1][2] : " + arrx[1][2]);
        System.out.println("Nilai arrx[2][0] : " + arrx[2][0]);
        System.out.println("Nilai arrx[2][1] : " + arrx[2][1]);
        System.out.println("Nilai arrx[2][2] : " + arrx[2][2]);

        int sum =0;
        for (int[] arrx1: arrx){
            for (int arrx2: arrx1){
                sum+=arrx2;
            }
        }
        System.out.println("Jumlah data : "+sum);
    }
}

/**
 * line ke 4-12 = nilai array
 * line 13 = menampilkan nilai array 2D pada [0][0]
 * line 13 = menampilkan nilai array 2D pada [0][1]
 * line 13 = menampilkan nilai array 2D pada [0][2]
 * line 13 = menampilkan nilai array 2D pada [1][0]
 * line 13 = menampilkan nilai array 2D pada [1][1]
 * line 13 = menampilkan nilai array 2D pada [1][2]
 * line 13 = menampilkan nilai array 2D pada [2][0]
 * line 13 = menampilkan nilai array 2D pada [2][1]
 * line 13 = menampilkan nilai array 2D pada [2][2]
 * line 24 = Looping For each untuk memindahkan semua data dari Array 2D arrx ke array 1D arrx1
 * line 25 = Looping For each untuk memindahkan semua data dari Array arrx1 ke arrx2
 * line 26 = menjumlahkan semua data dari tiap array hingga batas arrx2 dan disimpan kedalam sum
 * line 29 = menampilkan nilai dari sum atau jumlah data
 */
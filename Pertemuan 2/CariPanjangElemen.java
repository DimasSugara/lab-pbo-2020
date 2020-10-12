public class CariPanjangElemen {
    public static void main(String args[]) {
        int x[][][][]=new int[2][][][];
        x[0]=new int[1][][];
        x[0][0]=new int[2][];
        x[0][0][0]=new int[3];
        x[0][0][1]=new int[2];
        x[1]=new int[2][][];
        x[1][0]=new int[1][];
        x[1][0][0]=new int[2];
        x[1][1]=new int[2][];
        x[1][1][0]=new int[1];
        x[1][1][1]=new int[3];
        
        System.out.println(x.length);
        System.out.println(x[0].length);
        System.out.println(x[0][0].length);
        System.out.println(x[0][0][0].length);
        System.out.println(x[0][0][1].length);
        System.out.println();
        System.out.println(x[1].length);
        System.out.println(x[1][0].length);
        System.out.println(x[1][0][0].length);
        System.out.println(x[1][1].length);
        System.out.println(x[1][1][0].length);
        System.out.println(x[1][1][1].length);
    }
}

/**
 * line 4-13 = nilai array
 * line 15 = menampilkan panjang array x
 * line 16 = menampilkan panjang array x[0]
 * line 17 = menampilkan panjang array x[0][0]
 * line 18 = menampilkan panjang array x[0][0][0]
 * line 19 = menampilkan panjang array x[0][0][1]
 * line 20 = menampilkan (void)
 * line 21 = menampilkan panjang array x[1]
 * line 22 = menampilkan panjang array x[1][0]
 * line 23 = menampilkan panjang array x[1][0][0]
 * line 24 = menampilkan panjang array x[1][1]
 * line 25 = menampilkan panjang array x[1][1][0]
 * line 26 = menampilkan panjang array x[1][1][1]
 * 
 */
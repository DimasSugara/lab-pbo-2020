public class Array1 {
    public static void main(String args[]) {
        int nilai[]=new int[3];
        nilai[0]=70;
        nilai[1]=80;
        nilai[2]=65;
        double ratarata=0.0;

        for(int i=0; i<nilai.length; i++)
            ratarata+=nilai[i];

        ratarata/=nilai.length;
        System.out.println("Nilai rata-rata = " + ratarata);
    }
}

/**
 * Line 9 = Looping hingga batas array nilai
 * line 10 = menjumlahkan semua nilai yang ada di array satu persatu dan disimpan di ratarata
 * line 12 = menghitung jumlah rata-rata dari jumlah nilai array yang disimpan di ratarata dengan dibagi panjang array nilai
 * line 13 = menampilkan nilai rata-rata yang ditelah dibagi sebelumnya
 */
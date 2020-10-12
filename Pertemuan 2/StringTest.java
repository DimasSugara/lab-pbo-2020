public class StringTest {
    public static void main(String args[]) {
        String str1 = "Pemrograman";
        String str2 = "Java";
        String str3 = "PemrogramanJava";
        System.out.println("String 1:"+str1);
        System.out.println("String 2:"+str2);
        System.out.println("String 3:"+str3);
        System.out.println("String 1 = String 3 ==>"+str1.equals(str3));
        System.out.println("String 2 = String 3 ==>"+str2.equals(str3));
        System.out.println("String 1 + String 2 = String 3 ==>"+(str1+str2).equals(str3));

        String str4 = "Universitas Syiah Kuala";
        String str5 = "universitas syiah kuala";
        System.out.println("String 4:"+str4);
        System.out.println("String 5:"+str5);
        System.out.println("Perintah Pembandingan dibawah mengabaikan antara huruf besar dengan huruf kecil");
        System.out.println("String 4 = String 5 ==> "+str4.equalsIgnoreCase(str5));
        System.out.println("String 4 + String 5 = String 5 + String 4 ==> "+(str4+str5).equalsIgnoreCase(str5+str4));
    }
}

/**
 * line 3-5 = input data string str1-3
 * line 6 = Menampilkan "String 1 : " dan nilai str1 ke layar
 * line 7 = Menampilkan "String 2 : " dan nilai str2 ke layar
 * line 8 = Menampilkan "String 3 : " dan nilai str3 ke layar
 * line 9 = Menampilkan "String 1 = String 3 ==>" dan membandingkan apakah data dari str1 sama dengan str3 karena berbeda maka FALSE
 * line 10 = Menampilkan "String 2 = String 3 ==>" dan membandingkan apakah data dari str1 sama dengan str3 karena berbeda maka FALSE
 * line 11 = Menampilkan "String 1 + String 2 = String 3 ==>" dan membandingkan apakah data dari str1 + str2 sama dengan str3 karena sama maka TRUE
 * line 13-14 = input data string str4-5
 * line 15 = Menampilkan "String 4 : " dan nilai str4 ke layar
 * line 16 = Menampilkan "String 5 : " dan nilai str5 ke layar
 * line 17 = Menampilkan "Perintah Pembandingan dibawah mengabaikan antara huruf besar dengan huruf kecil" ke layar
 * line 18 = Menampilkan "String 4 = String 6 ==>" dan membandingkan apakah data dari str4 sama dengan str5(mengabaikan kapital atau tidak) karena sama maka TRUE
 * line 19 = Menampilkan "String 4 = String 6 ==>" dan membandingkan apakah data dari str4 + str5 sama dengan str5 + str4(mengabaikan kapital atau tidak) karena sama maka TRUE
 */
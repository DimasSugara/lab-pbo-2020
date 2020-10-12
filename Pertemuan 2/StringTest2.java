public class StringTest2 {
    public static void main(String args[]) {
        String str1 = "Informatika Universitas Syiah Kuala";
        System.out.println(str1.startsWith("Inf"));
        System.out.println(str1.endsWith("kuala"));
        System.out.println(str1.startsWith("Inf",1));
        System.out.println(str1.startsWith("Inf",2));
        System.out.println(str1.startsWith("Inf",3));
    }
}

/**
 * line 3 = Input data str1
 * line 4 = membandingkan apakah data str1 diawali dengan "Inf" atau tidak, karena diawali dengan "Inf" maka akan menampilkan TRUE di layar
 * line 5 = membandingkan apakah data str1 diakhiri dengan "kuala" atau tidak, karena diakhiri dengan "Kuala" (K di str1 adalah kapital) maka akan menampilkan FALSE di layar
 * line 6 = membandingkan apakah data pada memori str[1] diawali dengan "Inf" atau tidak, karena berbeda yakni "nfo" maka akan menampilkan FALSE di layar
 * line 7 = membandingkan apakah data pada memori str[2] diawali dengan "Inf" atau tidak, karena berbeda yakni "for" maka akan menampilkan FALSE di layar
 * line 8 = membandingkan apakah data pada memori str[3] diawali dengan "Inf" atau tidak, karena berbeda yakni "orm" maka akan menampilkan FALSE di layar
 * note : karena data pada array str1 diawalai pada str[0]
 */
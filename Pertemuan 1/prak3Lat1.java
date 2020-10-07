class prak3Lat1 {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;

        System.out.println("a + b = " + (a + b) ); 
        System.out.println("a - b = " + (a - b) ); 
        System.out.println("a * b = " + (a * b) ); 
        System.out.println("b / a = " + (b / a) ); 
        System.out.println("b % a = " + (b % a) ); 
        System.out.println("c % a = " + (c % a) ); 
        System.out.println("a++   = " + (a++) ); 
        System.out.println("b--   = " + (b--) ); 
        System.out.println("d++   = " + (d++)); 
        System.out.println("++d   = " + (++d)); 
    }
}

/**
 * line 8 = nilai a(10) ditambah niali b(20) maka hasilnya 30
 * line 9 = nilai a(10) dikurang nilai b(20) maka hasilnya -10
 * line 10 = nilai a(10) dikalikan nilai b(20) maka hasilnya 200
 * line 11 = nilai b(20) dibagi nilai a(10) maka hasilnya 2
 * line 12 = sisa nilai b(20) dibagi nilai a(10) maka hasilnya 0
 * line 13 = sisa nilai c(25) dibagi nilai a(10) maka hasilnya 5
 * line 14 = nilai a(10) di increment menjadi 11. Namun, karena post-increment maka nilai a(10) yang ditampilkan
 * line 15 = nilai b(20) di decrement menjadi 19. Namun, karena post-decrement maka nilai b(20) yang ditampilkan
 * line 16 = nilai d(25) di increment menjadi 26. Namun, karena post-increment maka nilai d(25) yang ditampilkan
 * line 17 = nilai d(26) yang sebelumnya akan di pre-increment. Maka yang ditampilkan adalah nilai d(27)
 */
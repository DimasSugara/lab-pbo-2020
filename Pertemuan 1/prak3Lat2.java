public class prak3Lat2 {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 0;

        c = a + b; 
        System.out.println("c = a + b = " + c );

        c += a ; 
        System.out.println("c += a = " + c );

        c -= a ; 
        System.out.println("c -= a = " + c );

        c *= a ; 
        System.out.println("c *= a = " + c );

        a = 10; 
        c = 15; 
        c /= a ; 
        System.out.println("c /= a = " + c );

        a = 10; 
        c = 15; 
        c %= a ; 
        System.out.println("c %= a = " + c );

        c <<= 2 ; 
        System.out.println("c <<= 2 = " + c );

        c >>= 2 ; 
        System.out.println("c >>= 2 = " + c );

        c >>= 2 ; 
        System.out.println("c >>= 2 = " + c );

        c &= a ; 
        System.out.println("c &= a = " + c );

        c ^= a ; 
        System.out.println("c ^= a = " + c );
        
        c |= a ; 
        System.out.println("c |= a = " + c );
    }       
}

/**
 * line 7 = nilai a(10) ditambah nilai b(20) akan disimpan di c(30)
 * line 10 = nilai c(30) sebelumnya akan ditambah dengan nilai a(10), maka nilai c sekarang 40
 * line 13 = nilai c(40) yang sebelumnya akan dikurangi dengan nilai a(10), maka nilai c sekarang 30
 * line 16 = nilai c(30) yang sebelumnya dikalikan nilai a(10), maka nilai c sekarang 300
 * line 19,20 = nilai a dan c yang baru yakni 10 dan 15
 * line 21 = nilai c(15) dibagi nilai a(10) dengan angka dibelakang koma tidak dipakai, maka nilai c sekarang 1
 * line 24,25 = nilai a dan c yang baru yakni 10 dan 15
 * line 26 = sisa pembagian nilai c(15) dengan nilai a(10), maka nilai c sekarang 5
 * line 29 = shift left, operasi nilai pada angka biner c sebelumnya sebanyak 2. Maka nilai c sekarang 20
 * line 32 = shift right, operasi nilai pada angka biner c sebelumnya sebanyak 2. Maka nilai c sekarang 5
 * line 35 = shift right, operasi nilai pada angka biner c sebelumnya sebanyak 2. Maka nilai c sekarang 1
 * line 38 = AND, operasi nilai pada angka biner c dengan nilai a. Maka nilai c sekarang 0
 * line 41 = XOR, operasi nilai pada angka biner c dengan nilai a. Maka nilai c sekarang 10
 * line 44 = OR, operasi nilai pada angka biner c dengan nilai a. Maka nilai c sekarang 10
 */
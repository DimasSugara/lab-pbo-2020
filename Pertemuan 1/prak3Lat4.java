public class prak3Lat4 {
	public static void main(String args[]) {
		int a = 60;	/* 60 = 0011 1100 */
		int b = 13; /* 13 = 0000 1101 */ 
		int c = 0;

		c = a & b;	/*12=	0000 1100	*/
		System.out.println("a & b	= " + c );	

		c = a | b;	/*61=	0011 1101	*/
		System.out.println("a | b	= " + c );	
	
		c = a ^ b;	/*49=	0011 0001	*/
		System.out.println("a ^ b	= " + c );	

		c = ~a;	/*-61 =	1100 0011	*/
		System.out.println("~a = " + c	);	

		c = a << 2; /* 240 = 1111 0000 */ 
		System.out.println("a << 2 = " + c );

		c = a >> 2;	/* 15 = 0000 1111 */
		System.out.println("a >> 2	= " + c );

		c = a >>> 2; /* 15 = 0000 1111 */ 
		System.out.println("a >>> 2 = " + c );
	}
}

/**
 * line 7 = menggunakan operator bitwise AND yang beroperasi pada angka biner dari nilai a(60) dan b(13), yang disimpan pada nilai c(12)
 * line 10 = menggunakan operator bitwise OR yang beroperasi pada angka biner dari nilai a(60) dan b(13), yang disimpan pada nilai c(61)
 * line 13 = menggunakan operator bitwise XOR yang beroperasi pada angka biner dari nilai a(60) dan b(13), yang disimpan pada nilai c(49)
 * line 16 = menggunakan operator bitwise compiment yang beroperasi pada angka biner dari nilai (-a)-1, yang disimpan pada nilai c(-61)
 * line 19 = menggunakan operator bitwise SHIFT LEFT yang beroperasi pada angka biner dari nilai a(60) sebanyak 2, yang disimpan pada nilai c(240)
 * line 22 = menggunakan operator bitwise SHIFT RIGHT yang beroperasi pada angka biner dari nilai a(60) sebanyak 2, yang disimpan pada nilai c(15)
 * line 25 = menggunakan operator bitwise SHIFT RIGHT yang beroperasi pada angka biner dari nilai a(60) sebanyak 2 dan nilai digeser juga diubah menjadi 0, yang disimpan pada nilai c(15)
 */
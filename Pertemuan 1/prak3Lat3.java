public class prak3Lat3 {	
	public static void main(String args[]) { 
		int a = 10;
		int b = 20;

		System.out.println("a == b = " + (a == b) );
		System.out.println("a != b = " + (a != b) );
		System.out.println("a > b = " + (a > b) );
		System.out.println("a < b = " + (a < b) );
		System.out.println("b >= a = " + (b >= a) );
		System.out.println("b <= a = " + (b <= a) );
	}
}

/**
 * line 6 = menggunakan operator untuk membandingkan nilai yang sama pada nilai a(10) dan b(20), karena tidak sama maka FALSE
 * line 7 = menggunakan operator untuk membandingkan nilai yang tidak sama pada nilai a(10) dan b(20), karena tidak sama maka TRUE
 * line 8 = menggunakan operator lebih besar pada nilai a(10) dan b(20), karena nilai a(10) lebih kecil dibanding nilai b(20) maka FALSE
 * line 9 = menggunakan operator lebih kecil pada nilai a(10) dan b(20), karena nilai a(10) lebih kecil dibanding nilai b(20) maka TRUE
 * line 10 = menggunakan operator lebih besar sama dengan pada nilai b(20) dan a(10), karena nilai b(20) lebih besar dibanding nilai a(10) maka TRUE
 * line 11 = menggunakan operator lebih kecil sama dengan pada nilai b(20) dan a(10), karena nilai b(20) lebih kecil dibanding nilai a(10) maka FALSE
 */
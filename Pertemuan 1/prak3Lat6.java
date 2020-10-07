public class prak3Lat6 {	
	public static void main(String args[]) { 
		int a, b;

		a = 10;
		b = (a == 1) ? 20: 30;
		System.out.println( "Value of b is : " +	b );

		b = (a == 10) ? 20: 30;
		System.out.println( "Value of b is : " + b );
	}
}

/**
 * line 6 = menggunakan operator conditional jika nilai a adalah 1 maka TRUE dan jika bukan maka FALSE, karena a(10) maka FALSE dan nilai diambil di sebelah kanan yakni b(30)
 * line 9 = menggunakan operator conditional jika nilai a adalah 10 maka TRUE dan jika bukan maka FALSE, karena a(10) maka TRUE dan nilai diambil di sebelah kiri yakni b(20)
 */
public class prak3Lat5 {
	public static void main(String args[]) { 
		boolean a = true;
		boolean b = false;

		System.out.println("a && b = " + (a&&b)); 
		System.out.println("a || b = " + (a||b) );
		System.out.println("!(a && b) = " + !(a && b));
	}	
}

/**
 * line 6 = menggunakan operator boolean yang apa bila nilai a dan nilai b sama-sama TRUE maka hasil akan TRUE, namun karna b FALSE maka outputnya FALSE
 * line 7 = menggunakan operator boolean yang apa bila nilai a dan nilai b sama-sama FALSE maka hasil akan FALSE, namun karna a TRUE maka outputnya TRUE
 * line 8 = menggunakan operator boolean yang apa bila nilai a dan nilai b sama-sama TRUE maka hasil akan TRUE, namun karna ada ! jadi nilai berlawan yang sebelumnya FALSE menjadi TRUE 
 */
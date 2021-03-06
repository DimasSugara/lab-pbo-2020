import java.util.Scanner;

public class Kalkulator {
 	public static void main(String[] args) {
 		Kalkulator kalkulator = new Kalkulator();
 		kalkulator.perhitungan();
 	}
 	
 	protected void perhitungan() {
 		InputHelper input = new InputHelper();
 		String s1 = input.getInput("Masukkan angka: ");
 		String s2 = input.getInput("Masukkan angka: ");
 		String op = input.getInput("Pilih operasi (+ - * /):");
 		double result = 0;
 
 	try {
 		switch (op) {
 			case "+":
 			result = MathHelper.penambahan(s1, s2);
 			break;
 			case "-":
 			result = MathHelper.pengurangan(s1, s2);
 			break;
 			case "*":
 			result = MathHelper.perkalian(s1, s2);
 			break;
 			case "/":
 			result = MathHelper.pembagian(s1, s2);
 			break;
 			default:
 			System.out.println("Operasi tidak dikenal!");
 			return;
 		}
 		System.out.println("Hasil: " + result);
 	} catch (Exception e) {
 		System.out.println("Number formatting exception " +
		e.getMessage());
 	    }
	}
}

/**
 * line 10-14 = Output menanyakan Angka untuk kalkulator sederhana
 * line 18-32 = Switch case kalkulator
 * line 35-38 = Exception handling
 */
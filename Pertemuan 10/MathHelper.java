public class MathHelper {
 
 	public static double penambahan(String s1, String s2) {
 		double d1 = Double.parseDouble(s1);
 		double d2 = Double.parseDouble(s2);
 		return d1 + d2;
 	}
 
 	public static double pengurangan(String s1, String s2) {
 		double d1 = Double.parseDouble(s1);
 		double d2 = Double.parseDouble(s2);
 		return d1 - d2;
 	}
 	
 	public static double perkalian(String s1, String s2) {
 		double d1 = Double.parseDouble(s1);
 		double d2 = Double.parseDouble(s2);
 		return d1 * d2;
 	}
 
 	public static double pembagian(String s1, String s2) {
 		double d1 = Double.parseDouble(s1);
 		double d2 = Double.parseDouble(s2);
 		return d1 / d2;
 	}
} 

/**
 * line 3- 7 = pertambahan atau operasi tambah:
 * line 9-13 = pengurangan atau operasi kurang:
 * line 15-19 = perkalian atau operasi kali:
 * line 21-25 = pembagian atau operasi bagi:
 */
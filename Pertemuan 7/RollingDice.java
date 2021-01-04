import java.util.Random;

public class RollingDice {
 	public static void main(String[] args) {
 
 		Random rand = new Random();
 		int tries = 0;
 		int sum = 0;
 		while (sum != 7) {
 			// roll the dice once
 			int roll1 = rand.nextInt(6) + 1;
 			int roll2 = rand.nextInt(6) + 1;
 			sum = roll1 + roll2;
 			System.out.println(roll1 + " + " + roll2 + " = " + sum);
 			tries++;
 		}
 		System.out.println("You won after " + tries + " tries!");
 	}
}

/**
 * line 11 & 12 = Range dadu 1-6
 * line 13 = Nilai yang muncul dari dua dadu dijumlah
 * line 15 = perulangan selama sum mencapai 7
 */
import java.util.Random;

public class CoinFlip {
 	public static void main(String[] args) {
 	// 50% chance heads, 50% chance tails
 		Random rand = new Random();
 		double chance = rand.nextDouble();
 		if (chance < 0.5) {
 				System.out.println("heads!");
 			} 
 		else {
 			System.out.println("tails!");
 		}
 	}
}

/**
 * Menggunakan import java.util.Random menghasilkan compilasi Random.
objek random tersebut membuat nilai acak untuk double chance.
 * penggenerate angka acak tersebut mengacu pada system time, Yang membuat
nilai acak 1:2 bagi tiap output
 */
import java.util.Random;
	
public class RandomRange {
 	public static void main(String[] args) {
 		Random num = new Random();
 		int randomnum = num.nextInt(10)+4;
 		System.out.println("Random Number: " + randomnum);
 	}
}

/**
 * line 6 = membuat nilai acak dengan menggunakan class Random().
 * Class Random mengembalikan nilai acak bertipe integer, double, Boolean, float dan long.
 */
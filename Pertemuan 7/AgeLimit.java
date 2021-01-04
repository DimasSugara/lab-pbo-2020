import java.util.Scanner;

public class AgeLimit {
 	public static void main(String args[]) {
 
 		int age=0;
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter age ");
 		age = sc.nextInt();
 		//age=Math.max(age,0);
 		age=Math.min(40, age);
 		System.out.print("Age is "+age);
 	}
}

/**
 * line 4 = method main
 * line 11 = syarat umur dengan formula Math.min(40, age)
 */
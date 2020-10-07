public class Smallest{
	public static void main(String arg[]){
		int a, b;
		Mulai:
		
		for(a=0; a<2; a++) {
			for(b=0; b<3; b++) {
				if(b==2)
				break Mulai;
		
				System.out.println("a=" + a + " ; b=" + b);
			}
		}
	}
}

/**
 * line 6 = looping pertama
 * line 7 = looping di dalam looping di line 6
 * line 8 = jika b sama dengan 2, maka break Mulai akan menghentikan looping pertama dan tampilan outputnya adalah
 * 			a = 0, b = 0
 * 			a = 0, b = 1
 */
public class LoopingFor{
	public static void main(String arg[]){
		for (int i=0; i<10; i++){
			for (int j=0; j<i+1; j++)
		    System.out.print('*');
		    System.out.println();
		}
	}
}
interface Sayable2{
 	void say();
}

public class MethodReference {
 	public static void saySomething(){
 		System.out.println("Hello, this is static method.");
 	}
 
 	public static void main(String[] args) {
 		// Referring static method
 		Sayable sayable = MethodReference::saySomething;

 		// Calling interface method
 		sayable.say();
 	}
}
/**
 * code diatas adalah method reference ke method static
 */
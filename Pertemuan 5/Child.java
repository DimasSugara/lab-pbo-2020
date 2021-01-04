/*public class Child extends Parent {
	int x;
	
	public Child() {
	x = 5;

	super();
	}
}*/

/**
 * terjadi error karena pemanggilan method super() nya tidak awal.
 */

 /**Update FIXED */

public class Child extends Parent {
	int x;

	public Child() {
	super();
	x = 5;
	}
}

/**
 * tidak error karena pemanggilan Method Super diawal
 */
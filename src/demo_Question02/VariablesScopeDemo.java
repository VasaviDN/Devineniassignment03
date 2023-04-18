package demo_Question02;

public class VariablesScopeDemo {
	public static void main(String[] args) {
	}
}

class Flower {
	public void publicMethod() {
		System.out.println("Public method.");
	}

	protected void protectedMethod() {
		System.out.println("Protected method.");
	}

	void defaultMethod() {
		System.out.println("Default method.");
	}

	private void privateMethod() {
		System.out.println("Private method.");
	}
}

class Rose extends Flower {
	// Converting the public method to private - Causes an error
	// Uncomment the method to check
	/*
	 * private void publicMethod() {
	 * System.out.println("Public method converted to private"); }
	 */

	// Converting the protected method to public - Possible
	public void protectedMethod() {
		System.out.println("Protected method converted to public");
	}

	// Converting the private method to protected - Possible
	protected void privateMethod() {
		System.out.println("Private method converted to protected");
	}

	// Converting the default method to public - Causes an error
	// Uncomment the method to check
	/*
	 * private void defaultMethod() {
	 * System.out.println("Default method converted to private"); }
	 */

}
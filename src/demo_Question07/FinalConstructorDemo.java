package demo_Question07;

public class FinalConstructorDemo {
	private String name;

	// Can't declare constructor as final - Object Creation for the class is not
	// possible
	// Uncomment to check this
	/*
	 * public final Constructor(String name) { this.name = name; }
	 */

	public static void main(String[] args) {
    	// Uncomment the below lines along with the final constructor
    	// FinalConstructorDemo demo = new FinalConstructorDemo(10);
		// System.out.println("Name: " + demo.name);
    }
}

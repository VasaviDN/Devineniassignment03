package demo_Question01;

/**
 * 
 * @author S554779 - Vasavi Devineni
 *
 */
public class GenericsMethodDemo {
	public static <T> void printArray(T[] input) {
		for (T val : input) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String[] str = { "Apple", "Car", "Dog" };
		System.out.println("Array names contain: ");
		printArray(str);
		
		Integer[] vals = {1,2,3};
		System.out.println("Array values contain: ");
		printArray(vals);
	}
}

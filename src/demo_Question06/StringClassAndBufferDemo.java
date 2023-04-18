package demo_Question06;

public class StringClassAndBufferDemo {
	public static void main(String[] args) {
		// StringBuffer Example
		StringBuffer strBuff = new StringBuffer("Let's");
		strBuff.append(" Go");
		System.out.println(strBuff); // Output: Let's Go

		// String Example
		String str1 = "Learning ";
		String str2 = "Python";
		String str3 = str1.concat(str2);
		System.out.println(str3); // Learning Python
	}
}

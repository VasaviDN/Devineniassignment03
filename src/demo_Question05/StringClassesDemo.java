package demo_Question05;

public class StringClassesDemo {

	public static void main(String[] args) {
		StringBuffer strBuff = new StringBuffer("Welcome");
		StringBuilder strbuilder = new StringBuilder("String Classes Demo");

		// StringBuffer methods
		strBuff.append(" My");
		System.out.println(strBuff);
		strBuff.insert(0, "name, ");
		System.out.println(strBuff);
		strBuff.replace(0, 3, "Vasavi");
		System.out.println(strBuff);

		// StringBuilder methods
		strbuilder.append(" Using append");
		System.out.println(strbuilder);
		strbuilder.insert(0, "Using insert, ");
		System.out.println(strbuilder);
		strbuilder.replace(0, 3, "Using replace");
		System.out.println(strbuilder);
	}

}

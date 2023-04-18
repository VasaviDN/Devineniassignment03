package demo_Question08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchDemo {
	public class TryFinallyExample {
		public static void main(String[] args) {
			BufferedReader rdr = null;
			try {
				rdr = new BufferedReader(new FileReader("input.txt"));
				String line = rdr.readLine();
				while (line != null) {
					System.out.println(line);
					line = rdr.readLine();
				}
			} catch (IOException e) {
				System.err.println("Error reading file: " + e.getMessage());
			} finally {
				try {
					if (rdr != null) {
						rdr.close();
					}
				} catch (IOException e) {
					System.err.println("Error closing file: " + e.getMessage());
				}
			}
		}
	}
}

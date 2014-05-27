package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		for (int i = 0; i < n; i++) {
			long num = Long.parseLong(br.readLine());
			long a = 0;
			while (num >= 5) {
				a = a + num / 5;
				num = num / 5;
			}
			System.out.println(a);
		}
	}

}

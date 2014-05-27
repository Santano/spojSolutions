package spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumSteps {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] in = br.readLine().split(" ");
			int x = Integer.parseInt(in[0]);
			int y = Integer.parseInt(in[1]);
			if (y > x) {
				System.out.println("No Number");
				continue;
			}
			if (x - y <= 2 && x % 2 == 1 && y % 2 == 1) {
				System.out.println(x + y - 1);
			} else if (x - y <= 2 && x % 2 == 0 && y % 2 == 0) {
				System.out.println(x + y);
			} else
				System.out.println("No Number");
		}
	}
}

package spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rectangles {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ans = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				if (i * j <= n)
					ans++;
			}
		}
		System.out.print(ans);
	}
}

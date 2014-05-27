package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SmallFactorials {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		for (int i = 0; i < n; i++) {
			long num = Long.parseLong(br.readLine());
			BigInteger ans = BigInteger.valueOf(num);
			num--;
			while (num > 1) {
				ans = ans.multiply(BigInteger.valueOf(num));
				num--;
			}
			System.out.println(ans);
		}
	}

}

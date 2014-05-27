package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversedNum {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] in = br.readLine().split(" ");
			String a = in[0];
			String b = in[1];
			int l = a.length() > b.length() ? a.length() : b.length();
			int ldiff = a.length() > b.length() ? a.length() - b.length() : b
					.length() - a.length();
			int n1 = Integer.parseInt(a);
			int n2 = Integer.parseInt(b);
			if (l == a.length())
				n2 = (int) (n2 * Math.pow(10, ldiff));
			else
				n1 = (int) (n1 * Math.pow(10, ldiff));
			int remainder = 0;
			String ans = "";
			for (int j = l - 1; j >= 0; j--) {
				int div = (int) Math.pow(10, j);
				int s1 = (n1 / div) % 10;
				int s2 = (n2 / div) % 10;
				int sum = s1 + s2 + remainder;
				ans = ans + sum % 10;
				remainder = sum / 10;
			}
			if (remainder != 0)
				ans = ans + remainder;
			System.out.println(Integer.parseInt(ans));
		}
	}
}

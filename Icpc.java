package spoj;

import java.io.*;

public class Icpc {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 1;
		while (true) {
			String[] in = br.readLine().split(" ");
			if (in.length <= 3)
				break;
			long max = 0;
			long second_max = 0;
			for (int i = 0; i < 4; i++) {
				long a = Long.parseLong(in[i]);
				if (a > max) {
					second_max = max;
					max = a;
				} else {
					if (a > second_max)
						second_max = a;
				}
			}
			Long ans = max + second_max;
			System.out.println("Case " + count + ": " + ans);
			count++;
		}
	}
}

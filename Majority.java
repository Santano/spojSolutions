package spoj;

import java.io.*;

public class Majority {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int len = Integer.parseInt(br.readLine());
			String[] in = br.readLine().split(" ");
			int pred = Integer.MAX_VALUE;
			int count = 0;
			for (int j = 0; j < len; j++) {
				if (Integer.parseInt(in[j]) == pred) {
					count++;
				} else {
					count--;
					if (count <= 0) {
						count = 0;
						pred = Integer.parseInt(in[j]);
					}
				}
			}
			count = 0;
			for (int j = 0; j < len; j++) {
				if (Integer.parseInt(in[j]) == pred) {
					count++;
				}
			}
			if (count > len / 2)
				System.out.println("Yes " + pred);
			else
				System.out.println("No");
		}
	}
}

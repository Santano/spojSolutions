package spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ToAndFro {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int col = Integer.parseInt(br.readLine());
			if (col == 0)
				return;
			char[] in = br.readLine().toCharArray();
			int len = in.length;
			int row = len / col;
			int counter = 0;
			char[][] message = new char[row][col];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					message[i][j] = in[counter];
					counter++;
				}
				i++;
				if (i == row)
					continue;
				for (int j = col - 1; j >= 0; j--) {
					message[i][j] = in[counter];
					counter++;
				}
			}
			String ans = "";
			// char[] ans = new char[len];
			counter = 0;
			for (int j = 0; j < col; j++) {
				for (int i = 0; i < row; i++) {
					if (message[i][j] == '\0')
						break;
					ans = ans + message[i][j];
				}
			}
			// String ansString = "";
			// for (int i = ans.length - 1; i >= 0; i++) {
			// char prev = ans[i];
			// while (!skipped && ans[i] == prev)
			// continue;
			// skipped = true;
			// ansString = ans[i] + ansString;
			// }
			System.out.println(ans);
		}
	}
}

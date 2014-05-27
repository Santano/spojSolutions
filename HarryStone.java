package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HarryStone {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] in = br.readLine().split(" ");
			int row = Integer.parseInt(in[0]);
			int col = Integer.parseInt(in[1]);
			int[][] input = new int[row][col];
			int[][] max_stones = new int[row][col];
			for (int j = 0; j < row; j++) {
				String[] rowIn = br.readLine().split(" ");
				for (int k = 0; k < col; k++) {
					input[j][k] = Integer.parseInt(rowIn[k]);
				}
			}
			int max = 0;
			for (int j = 0; j < row; j++) {
				for (int k = 0; k < col; k++) {
					max_stones[j][k] = getMaxStones(j, k, max_stones) + input[j][k];
					max = max > max_stones[j][k] ? max : max_stones[j][k];
				}
			}
			System.out.println(max);
		}
	}

	public static int getMaxStones(int currRow, int currCol, int[][] inputArr) {
		int max = 0;
		try {
			int v1 = inputArr[currRow-1][currCol - 1];
			max = v1 > max ? v1 : max;
		} catch (Exception e) {
		}
		try {
			int v1 = inputArr[currRow-1][currCol];
			max = v1 > max ? v1 : max;
		} catch (Exception e) {
		}
		try {
			int v1 = inputArr[currRow-1][currCol + 1];
			max = v1 > max ? v1 : max;
		} catch (Exception e) {
		}
		return max;
	}
}

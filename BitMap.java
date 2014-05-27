package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int x = 0; x < n; x++) {
			String[] in = br.readLine().split(" ");
			int row = Integer.parseInt(in[0]);
			int col = Integer.parseInt(in[1]);
			int[][] distArr = new int[row][col];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					distArr[i][j] = Integer.MAX_VALUE;
				}
			}
			char[][] inArr = new char[row][col];
			for (int i = 0; i < row; i++) {
				inArr[i] = br.readLine().toCharArray();
				for (int j = 0; j < col; j++) {
					if (inArr[i][j] == '1') {
						fillNeighbor(distArr, i, j, 0);
					}
				}
			}
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(distArr[i][j] + " ");
				}
				System.out.println("");
			}
		}
	}

	private static void fillNeighbor(int[][] distArr, int i, int j,
			int currCellValue) {
		try {
			if (distArr[i][j] <= currCellValue)
				return;
			distArr[i][j] = currCellValue;
		} catch (Exception e) {
			return;
		}
		fillNeighbor(distArr, i + 1, j, currCellValue + 1);
		fillNeighbor(distArr, i, j + 1, currCellValue + 1);
		fillNeighbor(distArr, i - 1, j, currCellValue + 1);
		fillNeighbor(distArr, i, j - 1, currCellValue + 1);
	}
}

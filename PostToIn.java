package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class PostToIn {

	static HashMap<Character, Integer> priority = new HashMap<Character, Integer>();
	static {
		priority.put('(', 0);
		priority.put('+', 1);
		priority.put('-', 1);
		priority.put('*', 2);
		priority.put('/', 3);
		priority.put('^', 4);
	}

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
			char[] input = br.readLine().toCharArray();
			Stack<Character> s = new Stack<Character>();
			for (int j = 0; j < input.length; j++) {
				char curr = input[j];
				if (Character.isLetter(curr)) {
					System.out.print(curr);
					continue;
				}
				if (s.isEmpty() || curr == '(') {
					s.push(curr);
					continue;
				}
				char sym = s.pop();
				if (curr == ')') {
					while (sym != '(') {
						System.out.print(sym);
						sym = s.pop();
					}
					continue;
				}
				if (priority.get(sym) < priority.get(curr)) {
					s.push(sym);
					s.push(curr);
					continue;
				} else {
					while (priority.get(sym) >= priority.get(curr)) {
						System.out.print(sym);
						sym = s.pop();
					}
					s.push(sym);
					s.push(curr);
				}
			}
			while (!s.isEmpty()) {
				int c = s.pop();
				if (c != '(')
					System.out.print(c);
			}
			System.out.println("");
		}
	}
}

package inflearn.ch5;

import java.io.InputStreamReader;
import java.util.Stack;
import java.io.BufferedReader;

public class No02 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < input.length(); i++) {
			if (stack.isEmpty()&&input.charAt(i)!='(') {
				sb.append(input.charAt(i));
			}
			if (input.charAt(i) == '(') {
				stack.push('(');
			} else if (input.charAt(i) == ')') {
				stack.pop();
			}

		}

		System.out.println(sb.toString());

	}
}

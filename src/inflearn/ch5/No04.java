package inflearn.ch5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

// 후위식 연산(postfix)
public class No04 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] input = br.readLine().toCharArray();
		Stack<Integer> stack = new Stack<Integer>();
		int answer = 0;
		for (int i = 0; i < input.length; i++) {
			char c = input[i];
			if (isNumber(c)) {
				int t = c - 48;
				stack.push(t);
			} else {
				calculate(stack, c);
			}
		}

		System.out.println(stack.pop());

	}

	public static void calculate(Stack<Integer> stack, char c) {
		if (c == '+') {
			int a = stack.pop();
			int b = stack.pop();
			stack.push(a + b);
		}

		if (c == '-') {
			int a = stack.pop();
			int b = stack.pop();
			stack.push((b - a));
		}

		if (c == '*') {
			int a = stack.pop();
			int b = stack.pop();
			stack.push((a * b));
		}

		if (c == '/') {
			int a = stack.pop();
			int b = stack.pop();
			stack.push((b / a));
		}

	}

	// 숫자인지 판별
	public static boolean isNumber(char c) {
		if (Character.isDigit(c)) {
			return true;
		}
		return false;
	}

}

package inflearn.ch5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class No02Answer {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		Stack<Character> stack = new Stack<Character>();
		for (Character c : input.toCharArray()) {
			if (c == ')') {
				while (stack.pop() != '(');
			} else {
				stack.push(c);
			}
			System.out.println(stack);
		}

		stack.forEach(s -> System.out.print(s));
	}

}

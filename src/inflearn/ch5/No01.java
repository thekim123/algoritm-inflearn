package inflearn.ch5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class No01 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '(') {
				stack.push(input.charAt(i));
			} else {
				
				if (stack.isEmpty()) {
					answer = "NO";
				} else {
					stack.pop();
				}
				
			}

		}
		
		System.out.println(answer);
	}

}

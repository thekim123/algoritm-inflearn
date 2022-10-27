package inflearn.ch5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class No05 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		Stack<Character> stack = new Stack<Character>();
		int bar = 0; //불필요한 변수 -> stack.size(); 로 대체 가능
		int answer = 0;

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '(') {
				stack.push(c);
				bar++;
				System.out.println("push");
			} else {
				stack.pop();
				bar--;
				if (input.charAt(i - 1) != '(') {
					answer++;
				} else {
					answer = answer + bar;
				}
				System.out.println("pop");
			}
//
//			System.out.println("bar : " + bar);
//			System.out.println("answer : " + answer);
//			System.out.println(stack);
//			System.out.println("----------");
		}
		System.out.println(answer);
	}

}

package inflearn.ch7;

import java.util.Scanner;

public class No06 {

	private static int n;
	private static int[] ch;

	public static void main(String[] args) {
		setVariable();
		dfs(1);
	}

	public static void setVariable() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ch = new int[n + 1];
		sc.close();
	}

	public static void dfs(int l) {
		if (l == n + 1) {
			printAnswer();
		} else {
			ch[l] = 1;
			dfs(l + 1);
			ch[l] = 0;
			dfs(l + 1);
		}
	}

	public static void printAnswer() {
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 1) {
				answer.append(i + " ");
			}
		}
		System.out.println(answer.toString());
	}

}

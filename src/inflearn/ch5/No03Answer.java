package inflearn.ch5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class No03Answer {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		Stack<Integer> stack = new Stack<Integer>();
		int k = Integer.parseInt(br.readLine());
		int answer = 0;

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < k; i++) {
			int no = Integer.parseInt(st.nextToken()) - 1;
			for (int j = 0; j < n; j++) {
				if (arr[j][no] == 0) {
					continue;
				} else {
					if (stack.isEmpty()) {
						stack.push(arr[j][no]);
						arr[j][no] = 0;
						break;
					}
					if (stack.peek() != arr[j][no]) {
						stack.push(arr[j][no]);
						arr[j][no] = 0;
						break;
					} else {
						stack.pop();
						arr[j][no] = 0;
						answer++;
						break;
					}
				}
			}
		}

		System.out.println(answer*2);

	}
}

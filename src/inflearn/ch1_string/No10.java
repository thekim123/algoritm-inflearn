// 내 풀이

package inflearn.ch1_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();

		String input = st.nextToken();
		char check = st.nextToken().charAt(0);

		char[] array = input.toCharArray();
		boolean[] answerArray = new boolean[array.length];
		int[] answer = new int[array.length];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = 101;
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] == check) {
				answerArray[i] = true;
			}
		}

		for (int i = 0; i < answer.length; i++) {
			if (answerArray[i])
				for (int j = 0; j < answer.length; j++) {
					if (answer[j] > Math.abs(i - j)) {
						answer[j] = Math.abs(i - j);
					}
				}
		}

		for (int i : answer) {
			sb.append(i).append(" ");
		}
		
		System.out.println(sb.toString());
	}
}

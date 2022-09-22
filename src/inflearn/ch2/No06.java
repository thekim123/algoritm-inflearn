package inflearn.ch2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No06 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int count = Integer.parseInt(br.readLine());
		int[] array = new int[count];

		boolean[] primeNumber = new boolean[100001];

		primeNumber[1] = primeNumber[0] = true;
		for (int i = 2; i < Math.sqrt(primeNumber.length); i++) {
			if (!primeNumber[i]) {
				for (int j = i; i * j < primeNumber.length; j++) {
					primeNumber[i * j] = true;
				}
			}
		}

		StringBuilder sb = new StringBuilder(br.readLine());
		StringBuilder resultSb = new StringBuilder();
		sb.reverse();
		st = new StringTokenizer(sb.toString(), " ");
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			if (!primeNumber[array[i]]) {
				resultSb.append(array[i] + " ");
			}
		}

		st = new StringTokenizer(resultSb.toString(), " ");
		int[] result = new int[st.countTokens()];
		for (int i = 0; st.hasMoreTokens(); i++) {
			result[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = result.length - 1; i >= 0; i--) {
			System.out.print(result[i] + " ");
		}
	}
}

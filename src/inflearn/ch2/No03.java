package inflearn.ch2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No03 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int count = Integer.parseInt(br.readLine());
		String throwA = br.readLine();
		String throwB = br.readLine();
		int[] arrayA = new int[count];
		int[] arrayB = new int[count];
		int match = 0;

		StringTokenizer stA = new StringTokenizer(throwA, " ");
		StringTokenizer stB = new StringTokenizer(throwB, " ");

		for (int i = 0; i < count; i++) {
			arrayA[i] = Integer.parseInt(stA.nextToken());
			arrayB[i] = Integer.parseInt(stB.nextToken());
		}

		for (int i = 0; i < arrayB.length; i++) {
			match = arrayA[i] - arrayB[i];
			if (match == 0) {
				sb.append("D\n");
			} else if (match == 1|| match == -2) {
				sb.append("A\n");
			} else {
				sb.append("B\n");
			}
		}
		
		System.out.println(sb.toString());

	}
}

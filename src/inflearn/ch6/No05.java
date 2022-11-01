package inflearn.ch6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] record = new int[10000001];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String answer = "U";
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if (record[temp] != 0) {
				answer = "D";
				break;
			}
			record[temp] = 1;
		}
		
		System.out.println(answer);
	}

}

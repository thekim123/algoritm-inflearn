package inflearn.ch3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No04 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int result = 0;
		for (int j = 0; j < arr.length; j++) {
			int sum = 0;
			for (int i = 0; i + j < n; i++) {
				sum += arr[i + j];
				if (sum == m) {
					result++;
				}
				if (sum > m) {
					break;
				}
			}
		}

		System.out.println(result);
	}

}

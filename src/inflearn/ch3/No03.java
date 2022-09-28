package inflearn.ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No03 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int max = 0;
		for (int i = 0; i < arr.length - (k - 1); i++) {
			int sum = 0;
			for (int j = 0; j < k; j++) {
				sum += arr[i + j];
			}
			if (sum > max) {
				max = sum;
			}
		}

		System.out.println(max);

	}
}

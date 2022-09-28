package inflearn.ch3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No06 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] == 0) {
					count++;
				}
				if (count > k) {
					break;
				}
				sum++;
			}
			if (result < sum) {
				result = sum;
			}
		}
		
		System.out.println(result);

	}
}

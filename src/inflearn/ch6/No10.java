package inflearn.ch6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No10 {

	public static void main(String[] args) throws Exception {

		// 변수 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		System.out.println(search(arr, c));
	}

	public static int search(int[] arr, int c) {
		// 거리 이분탐색
		int answer = 0;
		int lt = 1;
		int rt = arr[arr.length - 1];

		while (lt <= rt) {
			int mid = (lt + rt) / 2;
			if (count(arr, mid) >= c) {
				answer = mid;
				lt = mid + 1;
			} else {
				rt = mid - 1;
			}
		}

		return answer;

	}

	// 유효?
	public static int count(int[] arr, int mid) {
		int count = 1;
		int ep = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] - ep >= mid) {
				count++;
				ep = arr[i];
			}
		}
		return count;
	}

}

package inflearn.ch6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[][] arr = new int[n][2];
		for (int i = 0; i < arr.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i][0] > arr[j][0]) {
					sort(arr, i, j);
				}
			}
		}

		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i++) {
				if (yCondition(arr, i, j)) {
					sort(arr, i, j);
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}

	public static void sort(int[][] arr, int i, int j) {
		int x = arr[i][0];
		int y = arr[i][1];

		arr[i][0] = arr[j][0];
		arr[i][1] = arr[j][1];

		arr[j][0] = x;
		arr[j][1] = y;
	}

	public static boolean yCondition(int[][] arr, int i, int j) {
		return arr[i][0] == arr[j][0] && arr[i][1] > arr[j][1];
	}

}

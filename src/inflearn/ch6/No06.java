package inflearn.ch6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No06 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			arr2[i] = arr[i];
		}
		
		Arrays.sort(arr);
		for (int i = 0; i < arr2.length; i++) {
			if (arr[i] != arr2[i]) {
				System.out.print(i + 1 + " ");
			}
		}

	}

}

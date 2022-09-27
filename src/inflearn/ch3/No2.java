package inflearn.ch3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class No2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr1 = new int[n];

		for (int i = 0; i < n; i++) {
			int number = Integer.parseInt(st.nextToken());
			arr1[i] = number;
		}
		Arrays.sort(arr1);

		int m = Integer.parseInt(br.readLine());
		int[] arr2 = new int[m];
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			int number = Integer.parseInt(st1.nextToken());
			arr2[i] = number;
		}
		Arrays.sort(arr2);

		int temp1 = 0;
		int temp2 = 0;

		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int j = temp1; j < arr1.length; j++) {
			for (int i = temp2; i < arr2.length; i++) {
				if (arr1[j] == arr2[i]) {
					result.add(arr1[j]);
					temp1 = j;
					temp2 = i;
				}
			}
		}

		result.sort(Comparator.naturalOrder());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < result.size(); i++) {
			sb.append(result.get(i) + " ");
		}

		System.out.println(sb.toString());
	}
}
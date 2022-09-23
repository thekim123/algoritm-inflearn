package inflearn.ch3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class No2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		boolean[] arr1 = new boolean[1000000001];
		
		for (int i = 0; i < n; i++) {
			int number = Integer.parseInt(st.nextToken());
			arr1[number] = true;
		}

		int m = Integer.parseInt(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for (int j = 0; j < m; j++) {
			int number = Integer.parseInt(st1.nextToken());
			if (arr1[number]) {
				result.add(number);
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
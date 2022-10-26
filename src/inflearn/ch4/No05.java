package inflearn.ch4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

public class No05 {

	public static void main(String[] args) throws Exception {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine(), " ");
			Integer[] arr = new Integer[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			HashSet<Integer> set = new HashSet<Integer>();
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					for (int l = 0; l < arr.length; l++) {
						if (i != j && j != l && i != l) {
							set.add(arr[i] + arr[j] + arr[l]);
						}
					}
				}
			}

			ArrayList<Integer> list = new ArrayList<Integer>();
			set.forEach(s -> list.add(s));
			list.sort(Comparator.reverseOrder());
			System.out.println(list.get(k - 1));
		} catch (Exception e) {
			System.out.println("-1");
		}

	}

}

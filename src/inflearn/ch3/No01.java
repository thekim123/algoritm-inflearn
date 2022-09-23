package inflearn.ch3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No01 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr1 = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		int[] arr2 = new int[m];
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = Integer.parseInt(st1.nextToken());
		}
		
		int[]result = new int[n+m];
		
		for (int i = 0; i < n; i++) {
			result[i] = arr1[i];
		}
		
		for (int i = n; i < m+n; i++) {
			result[i] = arr2[i-n];
		}
		
		Arrays.sort(result);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
}

package inflearn.ch4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class No03SecondTry {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		int number = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < k-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		for (int i = k-1; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			sb.append(map.size()+" ");
			map.put(arr[i-k+1], map.get(arr[i-k+1])-1);
			if(map.get(arr[i-k+1])==0) {
				map.remove(arr[i-k+1]);
			}
		}
		
		System.out.println(sb.toString());
	}

}

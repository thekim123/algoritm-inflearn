package inflearn.ch2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No01 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int count = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		int[] array = new int[count];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		sb.append(array[0]+" ");
		for (int i = 1; i < array.length; i++) {
			if(array[i]>array[i-1]) {
				sb.append(array[i]).append(" ");
			}
		}
		
		System.out.println(sb.toString());
		
	}
}

package inflearn.ch2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No02 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int count = Integer.parseInt(br.readLine());
		int[] array = new int[count];
		int temp = 1;
		int result = 0;

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < array.length; i++) {
			if (temp < array[i]) {
				temp = array[i];
				result++;
			}
		}

		System.out.println(result);

	}

}

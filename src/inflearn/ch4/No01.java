package inflearn.ch4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class No01 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());

		char[] arr = br.readLine().toCharArray();
		HashMap<Character, Integer> result = new HashMap<>();
		result.put('A', 0);
		result.put('B', 0);
		result.put('C', 0);
		result.put('D', 0);
		result.put('E', 0);
		for (int i = 0; i < arr.length; i++) {
			int temp = result.get(arr[i]);
			result.put(arr[i], temp + 1);
		}

		int final1 = 0;
		String person = "A";
		if (final1 < result.get('A')) {
			final1 = result.get('A');
			person = "A";
		}
		;
		if (final1 < result.get('B')) {
			final1 = result.get('B');
			person = "B";
		}
		;
		if (final1 < result.get('C')) {
			final1 = result.get('C');
			person = "C";
		}
		;
		if (final1 < result.get('D')) {
			final1 = result.get('D');
			person = "D";
		}
		;
		if (final1 < result.get('E')) {
			final1 = result.get('E');
			person = "E";
		}
		;
		System.out.println(person);

	}

}

package inflearn.ch4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class No01Ans {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		char[] arr = br.readLine().toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : arr) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		int max = Integer.MIN_VALUE;
		char answer = 'A';
		for (char c : map.keySet()) {
			if(map.get(c)>max) {
				max = map.get(c);
				answer = c;
			}
		}
		System.out.println(answer);
	}
}

package inflearn.ch4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class No02 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] arr1 = br.readLine().toCharArray();
		char[] arr2 = br.readLine().toCharArray();
		
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		for (char c : arr1) {
			map1.put(c, map1.getOrDefault(c, 0)+1);
		}
		
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		for (char c : arr2) {
			map2.put(c, map2.getOrDefault(c, 0)+1);
		}
		
		String answer = "YES";
		for (char c : map1.keySet()) {
			if(map1.get(c) != map2.get(c)) {
				answer = "NO";
			}
		}
		
		System.out.println(answer);
	}
}

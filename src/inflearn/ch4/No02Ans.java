package inflearn.ch4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class No02Ans {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr1 = br.readLine().toCharArray();
		char[] arr2 = br.readLine().toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : arr1) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		String answer = "YES";
		for (char c : arr2) {
			if(!map.containsKey(c)|| map.get(c)==0) {
				answer="NO";
				break;
			}
			map.put(c, map.get(c)-1);
		}
		
		System.out.println(answer);
		
	}

}

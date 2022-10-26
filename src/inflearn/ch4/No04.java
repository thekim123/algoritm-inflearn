package inflearn.ch4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class No04 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sArr = br.readLine();
		String tArr = br.readLine();

		HashMap<Character, Integer> sm = new HashMap<>();
		HashMap<Character, Integer> tm = new HashMap<>();
		for (int i = 0; i < tArr.length(); i++) {
			tm.put(tArr.charAt(i), tm.getOrDefault(tArr.charAt(i), 0) + 1);
		}

		int length = tArr.length() - 1;
		for (int i = 0; i < length; i++) {
			sm.put(sArr.charAt(i), sm.getOrDefault(sArr.charAt(i), 0) + 1);
		}

		int answer = 0;
		int lt = 0;
		for (int rt = length; rt < sArr.length(); rt++) {
			sm.put(sArr.charAt(rt), sm.getOrDefault(sArr.charAt(rt), 0) + 1);
			if (sm.equals(tm)) {
				answer++;
			}
			sm.put(sArr.charAt(lt), sm.get(sArr.charAt(lt)) - 1);
			if (sm.get(sArr.charAt(lt)) == 0) {
				sm.remove(sArr.charAt(lt));
			}
			lt++;
		}
		System.out.println(answer);
	}

}

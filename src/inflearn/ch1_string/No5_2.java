package inflearn.ch1_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No5_2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] word = br.readLine().toCharArray();
		int lt = 0, rt = word.length - 1;

		while (lt < rt) {
			if (!Character.isAlphabetic(word[lt]))		// 문자가 알파벳인가?
				lt++;
			else if (!Character.isAlphabetic(word[rt]))
				rt--;
			else {
				char tmp = word[lt];
				word[lt] = word[rt];
				word[rt] = tmp;
				lt++;
				rt--;
			}
		}
		System.out.println(String.valueOf(word));

	}

}

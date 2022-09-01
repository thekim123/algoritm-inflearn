package inflearn.ch1_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No5 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		char[] word = input.toCharArray();
		char temp;
		int tempNum = word.length-1;

		for (int i = 0; i < word.length; i++) {
			for (int j = tempNum; j > i; j--) {
				if (isAlphabet(word[i]) && isAlphabet(word[j])) {
					temp = word[i];
					word[i] = word[j];
					word[j] = temp;
					tempNum = j-1;
					break;
				}
			}
			if(i>=tempNum) break;
		}
		for (char c : word) {
			System.out.print(c);
		}
	}

	static boolean isAlphabet(char a) {
		return a - 0 > 96 && a - 0 < 123 || a - 0 > 64 && a - 0 < 91;
	}
}

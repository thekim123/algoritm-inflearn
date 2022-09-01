package inflearn.ch1_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] word = br.readLine().toCharArray();
		
		for (int i = 0; i < word.length; i++) {
			if(word[i]-0>96) {
				word[i] -= 32;
			} else {
				word[i] += 32;
			}
		}
		
		for (char c : word) {
			System.out.print(c);
		}
	}

}

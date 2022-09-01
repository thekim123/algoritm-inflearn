package inflearn.ch1_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No4 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());
		char[] word;

		for (int i = 0; i < count; i++) {
			word = br.readLine().toCharArray();
			for (int j = word.length-1; j >= 0; j--) {
				System.out.print(word[j]);
			}
			System.out.println();
		}
	}

}

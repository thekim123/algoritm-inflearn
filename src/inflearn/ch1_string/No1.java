package inflearn.ch1_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] wordArr = br.readLine().toCharArray();
		char character = br.readLine().charAt(0);
		int charNumber = character - 0;
		
		if(charNumber<97) {
			charNumber+=32;
		}
		int count = 0;
		
	
		for (int i = 0; i < wordArr.length; i++) {
			if (wordArr[i] +32 == charNumber || wordArr[i] == charNumber) {
				count++;
			}
		}
		System.out.println(count);
	}
}

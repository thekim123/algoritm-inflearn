package inflearn.ch1_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No6 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		String answer ="";
		
		for (int i = 0; i < input.length(); i++) {
			if(i==input.indexOf(input.charAt(i))) {
				answer+= input.charAt(i); 
			}
		}

		System.out.println(answer);
	}
}

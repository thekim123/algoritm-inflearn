package inflearn.ch1_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No9 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String answer = "";
		
		for (char c : input.toCharArray()) {
			if(Character.isDigit(c)) {
				answer+=c;
			}
		}
		System.out.println(Integer.parseInt(answer));
	}

}

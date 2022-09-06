package inflearn.ch1_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No7 {
	
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine().toLowerCase();
		String result = "YES";
		
		for (int i = 0; i < input.length()/2; i++) {
			if(input.charAt(i) != input.charAt(input.length()-i-1)) {
				result = "NO";
				break;
			}
		}
		
		System.out.println(result);
		
	}

}

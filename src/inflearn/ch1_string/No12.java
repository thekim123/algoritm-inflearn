package inflearn.ch1_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No12 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		
		int count = Integer.parseInt(br.readLine());
		String password = br.readLine();
		int passwordNum = 0;
		char resultChar = '.';
		
		
		
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < 7; j++) {
				if(password.charAt(j)=='#') {
					passwordNum+= Math.pow(2, 6-j);
				}
			}
			resultChar = (char) (passwordNum);
			result.append(resultChar);
			password = password.substring(7);
			passwordNum=0;
		}
		
		System.out.println(result.toString());
		
	}

}

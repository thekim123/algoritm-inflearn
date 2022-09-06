package inflearn.ch1_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10_2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String input = st.nextToken();
		char target = st.nextToken().charAt(0);
		int[] answer = new int[input.length()];
		int point = 101;
		
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i)!=target) {
				point++;
			} else {
				point = 0;
			}
			answer[i] = point;
		}

		point = 101;
		for (int i = input.length()-1; i >= 0; i--) {
			if(input.charAt(i)!=target) {
				point++;
			}else {
				point = 0;
			}
			answer[i] = Math.min(answer[i], point);
		}
		
		for (int i : answer) {
			System.out.print(i+" ");
		}
	}
}

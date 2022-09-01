package inflearn.ch1_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No3 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String[] wordArr = new String[st.countTokens()];
		int result = 0;
		int length = 0;
		
		for (int i = 0; st.hasMoreTokens(); i++) {
			wordArr[i] = st.nextToken();
			if(wordArr[i].length()>length) {
				length = wordArr[i].length();
				result = i;
			}
		}
		
		System.out.println(wordArr[result]);
		
	}

}

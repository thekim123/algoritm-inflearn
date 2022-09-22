package inflearn.ch2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No07 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count =  Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] array = new int[count];
		for (int i = 0; st.hasMoreTokens(); i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		int constantScore = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]==1) {
				constantScore++;
				sum+=constantScore;
			} else {
				constantScore=0;
			}
		}
		System.out.println(sum);
	}
}

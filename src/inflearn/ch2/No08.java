package inflearn.ch2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No08 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());

		int[] scoreList = new int[count];
		int[] score = new int[101];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < scoreList.length; i++) {
			scoreList[i] = Integer.parseInt(st.nextToken());
			score[scoreList[i]]++;
		}

		for (int i = 100; i >= 100; i--) {
			if(score[i]!=0) {
				for (int j = 0; j < score[i]; j++) {
					
				}
			}
		}

	}
}

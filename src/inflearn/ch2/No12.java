package inflearn.ch2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No12 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int studentCount = Integer.parseInt(st.nextToken());
		int testCount = Integer.parseInt(st.nextToken());

		int[][] arr = new int[testCount][studentCount];

		for (int i = 0; i < testCount; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < studentCount; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		boolean[][] resultArr = new boolean[studentCount][studentCount];
		for (int i = 0; i < testCount; i++) {
			for (int j = 0; j < studentCount; j++) {
				for (int k = j; k < studentCount; k++) {
					resultArr[arr[i][k]-1][arr[i][j]-1] = true;
				}
			}
		}

		int result = 0;
		for (int i = 0; i < studentCount; i++) {
			for (int j = 0; j < studentCount; j++) {
				if(resultArr[i][j]==false) {
					result++;
				}
			}
		}
		
		System.out.println(result);
		
	}
}
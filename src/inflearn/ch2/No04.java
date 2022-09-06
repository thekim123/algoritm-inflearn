package inflearn.ch2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No04 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int count = Integer.parseInt(br.readLine());
		int firstNum = 1;
		int secondNum = 1;
		int result = 0;

		for (int i = 0; i < count; i++) {
			if (i < 2) {
				result = firstNum;
			}else {
				result = firstNum + secondNum;
				firstNum = secondNum;
				secondNum = result;
			}
			sb.append(result+" ");
		}

		System.out.println(sb.toString());
	}

}

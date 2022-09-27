package inflearn.ch3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No05 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = Integer.parseInt(br.readLine());
		int result = 0;

		for (int i = 2; i <= sum; i++) {
			int temp;
			int initNum;
			if (i % 2 != 0) {
				temp = (i - 1) / 2;
			} else {
				temp = i / 2;
			}
			initNum = sum / i -temp;

			if (sum / i - temp <= 0) {
				break;
			}
			
			int realSum = 0;
			for (int j = 0; j < i; j++) {
				realSum += initNum;
				initNum++;
			}
			System.out.println(realSum);
			System.out.println(i);
			System.out.println("------");
			if (realSum == sum || realSum + i == sum) {
				result++;
			}

		}
		System.out.println(result);
	}
}

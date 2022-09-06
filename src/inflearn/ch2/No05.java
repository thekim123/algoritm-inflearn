package inflearn.ch2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No05 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int number = Integer.parseInt(br.readLine());
		int count = 0;
		boolean[] primeNumber = new boolean[number + 1];

		primeNumber[0] = true;
		primeNumber[1] = true;

		for (int i = 2; i < Math.sqrt(primeNumber.length); i++) {
			if(!primeNumber[i]) {
				for (int j = i; i*j <= number; j++) {
					primeNumber[i*j] = true;
				}
			}
		}
		
		for (int i = 0; i < primeNumber.length; i++) {
			if(!primeNumber[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

}

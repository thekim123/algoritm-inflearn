package inflearn.ch7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No01 {

	public static int[] fibo;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		fibo = new int[n + 1];
		dfsN(n);
		for (int i = 1; i <= n; i++) {
			System.out.println(fibo[i]);
		}
	}

	public static int dfsN(int n) {
		if (fibo[n] != 0) {
			return fibo[n];
		}

		if (n == 1) {
			return fibo[n] = 1;
		} else if (n == 2) {
			return fibo[n] = 1;
		} else {
			return fibo[n] = dfsN(n - 2) + dfsN(n - 1);
		}
	}
	
}

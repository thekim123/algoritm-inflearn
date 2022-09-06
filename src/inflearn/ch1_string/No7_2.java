package inflearn.ch1_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// StringBuilder 버전

public class No7_2 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String in = br.readLine();
		String temp = new StringBuilder(in).reverse().toString();
		String answer = "NO";

		if (in.equalsIgnoreCase(temp)) {
			answer = "YES";
		}

		System.out.println(answer);

	}
}

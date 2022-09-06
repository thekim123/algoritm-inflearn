package inflearn.ch1_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String answer = "NO";
		String in = br.readLine();
		String out = in.toUpperCase().replaceAll("[^A-Z]", "");
		String convertOut = new StringBuilder(out).reverse().toString();
		if (convertOut.equals(out)) {
			answer = "YES";
		}
		System.out.println(answer);

	}

}

package inflearn.ch1_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No9_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int answer = 0;
		String input = br.readLine();

		for (char c : input.toCharArray()) {
			if (c >= 48 && c <= 57) {
				answer = answer * 10 + (c - 48);
			}
		}

		System.out.println(answer);

	}
}

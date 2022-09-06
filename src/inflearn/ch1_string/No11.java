package inflearn.ch1_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		char target = '.';
		int point = 1;
		String input = br.readLine();

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != target) {
				target = input.charAt(i);
				if (point > 1) {
					sb.append(point);
				}
				sb.append(target);
				point = 1;
			} else {
				point++;
			}
		}
		if(point>1) {
			sb.append(point);
		}

		System.out.println(sb.toString());

	}
}

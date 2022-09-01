package inflearn.ch1_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No4_2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++) {
			System.out.println(new StringBuilder(br.readLine()).reverse().toString());
		}
	}

}

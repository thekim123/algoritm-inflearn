package inflearn.ch5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class No07 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] neccesary = br.readLine().toCharArray();
		char[] input = br.readLine().toCharArray();

		Queue<Character> queue = new LinkedList<Character>();

		for (int i = 0; i < input.length; i++) {
			queue.add(input[i]);
		}

		int temp = 0;
		for (int i = 0; i < input.length; i++) {
			if (temp == neccesary.length) {
				break;
			}
			if (queue.poll() == neccesary[temp]) {
				temp++;
			}
		}

		if (neccesary.length == temp) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}

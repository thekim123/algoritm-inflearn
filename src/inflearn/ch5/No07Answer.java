package inflearn.ch5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class No07Answer {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String need = br.readLine();
		String plan = br.readLine();

		String answer = "YES";
		Queue<Character> q = new LinkedList<Character>();
		for (Character c : need.toCharArray()) {
			q.offer(c);
		}

		for (Character c : plan.toCharArray()) {
			if (q.contains(c)) {
				if (c != q.poll()) {
					answer = "NO";
				}
			}

		}

		if (!q.isEmpty()) {
			answer = "NO";
		}
		
		System.out.println(answer);
	}

}

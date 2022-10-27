package inflearn.ch5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No06 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
		
		int answer = 0;
		while (!queue.isEmpty()) {
			for (int i = 0; i < k-1; i++) {
				queue.offer(queue.poll());
			}
			answer = queue.poll();
		}
		
		System.out.println(answer);

	}

}

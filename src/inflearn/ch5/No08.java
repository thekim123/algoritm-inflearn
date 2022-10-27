package inflearn.ch5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No08 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");

		Queue<Person> q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			q.offer(new Person(i, Integer.parseInt(st.nextToken())));
		}

		int answer = 0;

		while (!q.isEmpty()) {
			Person temp = q.poll();
			for (Person p : q) {
				if (p.priority > temp.priority) {
					q.offer(temp);
					temp = null;
					break;
				}
			}

			if (temp != null) {
				answer++;
				if (temp.id == m) {
					System.out.println(answer);
				}
			}

		}

	}

}

class Person {
	int id;
	int priority;

	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}

}
package inflearn.ch5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No08Second {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Queue<Patient> q = new LinkedList<>();
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			q.offer(new Patient(i, Integer.parseInt(st.nextToken())));
		}

		int answer = 0;
		while (true) {
			Patient temp = q.poll();
			
			for (Patient p : q) {
				if (p.priority > temp.priority) {
					q.offer(temp);
					temp = null;
					break;
				}
			}
			
			if(temp != null) {
				answer++;
				if(temp.id==m) {
					break;
				}
			}
		}
		
		System.out.println(answer);

	}

}

class Patient {
	int id;
	int priority;

	public Patient(int id, int priority) {
		super();
		this.id = id;
		this.priority = priority;
	}

}

package inflearn.ch7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No08 {

	final static int[] DISTANCE = { 1, -1, 5 };
	static int[] ch;
	static int s;
	static int e;
	static Queue<Integer> queue;

	public static void main(String[] args) {
		No08 app = new No08();
		app.setVariable();
		int result = app.bfs();
		System.out.println(result);
	}

	public void setVariable() {
		queue = new LinkedList<>();
		ch = new int[10001];
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();
		e = sc.nextInt();
		sc.close();
	}

	public int bfs() {
		queue.offer(s);
		int result = search();
		return result;
	}

	public boolean isProper(int temp) {
		return ch[temp] == 0 && temp >= 1 && temp <= 10001;
	}

	public int search() {
		int level = 0;
		while (!queue.isEmpty()) {
			int length = queue.size();
			for (int i = 0; i < length; i++) {
				int data = queue.poll();
				if (data == e) {return level;}
				jump(queue, data);
			}
			level++;
		}
		return 0;
	}

	public void jump(Queue<Integer> queue, int data) {
		for (int number : DISTANCE) {
			int temp = data + number;
			if (isProper(temp)) {
				queue.offer(temp);
				ch[temp] = 1;
			}
		}
	}

}

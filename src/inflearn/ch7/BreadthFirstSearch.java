package inflearn.ch7;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.lt = new Node(2);
		root.rt = new Node(3);
		root.lt.lt = new Node(4);
		root.lt.rt = new Node(5);
		root.rt.lt = new Node(6);
		root.rt.rt = new Node(7);
		bfs(root);
	}

	public static void bfs(Node root) {

		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int level = 0;
		while (!q.isEmpty()) {
			int length = q.size();
			for (int i = 0; i < length; i++) {
				Node data = q.poll();
				System.out.println(data.data + " ");
				if (data.lt != null) {
					q.offer(data.lt);
				}
				if (data.rt != null) {
					q.offer(data.rt);
				}

				level++;
			}
		}

	}

}

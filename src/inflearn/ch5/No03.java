package inflearn.ch5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class No03 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		ArrayList<Stack> list = new ArrayList<Stack>();
		for (int i = 0; i < n; i++) {
			Stack<Integer> stack = new Stack<>();
			list.add(stack);
		}

		StringTokenizer st;
		for (int i = 0; i < list.size(); i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < n; j++) {
				list.get(j).push(Integer.parseInt(st.nextToken()));
			}
		}
		
		list.forEach(s->System.out.println(list));

		Stack<Integer> result = new Stack<Integer>();
		int m = Integer.parseInt(br.readLine());
		int[] moves = new int[m];
		int answer = 0;
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < moves.length; i++) {
			moves[i] = Integer.parseInt(st.nextToken());
			int b = 0;
			if (i > 0) {
				b = result.lastElement();
			}
			int a = (int) list.get(moves[i] - 1).pop();
			result.push(a);
			System.out.println(result);
			if (i > 0) {
				if (b == a) {
					System.out.println(b);
					System.out.println(a);
					while (result.lastElement() == b) {
						result.pop();
					}
					answer++;
					System.out.println(result);
				}
				System.out.println("-----");
			}
		}

		System.out.println(answer);
	}

}

package inflearn.ch6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class No04 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int s = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		ArrayList<Integer> cache = new ArrayList<Integer>();
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			int in = Integer.parseInt(st.nextToken());
			miss(s, cache);
			hit(in, cache);
			cache.add(in);

		}

		print(cache);
	}

	public static void miss(int s, ArrayList<Integer> cache) {
		if (cache.size() >= s) {
			cache.remove(0);
		}
	}

	public static void hit(int in, ArrayList<Integer> cache) {
		for (int i = 0; i < cache.size(); i++) {
			if (cache.get(i) == in) {
				cache.remove(i);
			}
		}
	}

	public static void print(ArrayList<Integer> cache) {
		for (int i = cache.size() - 1; i >= 0; i--) {
			System.out.print(cache.get(i) + " ");
		}
	}
}

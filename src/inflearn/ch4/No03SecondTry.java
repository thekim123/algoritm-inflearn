package inflearn.ch4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class No03SecondTry {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		int number = 0;
		while (number != n) {
			arr.add(Integer.parseInt(st.nextToken()));
			number++;
		}
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		
		
	}

}

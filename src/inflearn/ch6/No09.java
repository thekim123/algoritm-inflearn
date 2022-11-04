package inflearn.ch6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No09 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int sum = 0;

		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}

		int dvd = sum / m;
		int count = dvd;
		int trytry = 0;
		int state = 0;
		while (state == 1) {
			for (int j = 0; j < arr.length; j++) {
				if (count > arr[j]) {
					count -= arr[j];
					if (j == arr.length - 1) {
						System.out.println(dvd);
						state = 1;
						break;
					}
				} else {
					if (trytry == m) {
						trytry = 0;
						dvd++;
						break;
					}
					trytry++;
					count = dvd;
				}

			}
		}
	}
}

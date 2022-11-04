package inflearn.ch6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 이분탐색으로 풀어야 된다는걸 알고 시작한 풀이 - 못품 ㅋ
public class No09Second {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		int rt = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			rt += arr[i];
		}

		int lt = 0;
		int result = 0;
		int a = 0;
		while (a != 10) {
			int mid = (lt + rt) / 2;
			int temp = rt;
			int count = m;
			for (int i = 0; i < arr.length; i++) {
				System.out.println("lt : " + lt);
				System.out.println("rt : " + rt);
				System.out.println("mid : " + mid);
				System.out.println("arr[i] : " + arr[i]);
				if (i == arr.length - 1) {
					rt = mid;
					result = rt;
					break;
				}
				System.out.println("temp : " + temp);
				if (temp > arr[i]) {
					temp -= arr[i];
				} else {
					temp = rt;
					count--;
					System.out.println("count : " + count);
					if (count < 0) {
						lt = mid;
						break;
					}
				}
				System.out.println("------");

			}
			a++;

		}
		System.out.println(result);

	}

}

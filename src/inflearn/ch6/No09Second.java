package inflearn.ch6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// �̺�Ž������ Ǯ��� �ȴٴ°� �˰� ������ Ǯ�� - ��ǰ ��
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
				System.out.println("on : " + lt);
				System.out.println("off : " + rt);
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

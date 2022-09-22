package inflearn.ch2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class No06Ans {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());
		int[] array = new int[count];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		boolean[] isNotPrimeNumber = new boolean[100001];
		isNotPrimeNumber[0] = isNotPrimeNumber[1] = true;
		for (int i = 2; i < Math.sqrt(isNotPrimeNumber.length); i++) {
			if (!isNotPrimeNumber[i]) {
				for (int j = i*i; i * j <= isNotPrimeNumber.length; j+=i) {
					isNotPrimeNumber[j] = true;
				}
			}
		}
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < count; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			int temp = array[i];
			int res = 0;
			while (temp>0) {
				int t = temp%10;
				res = t+res*10;
				temp = temp/10;
			}
			if(!isNotPrimeNumber[res]) {
				result.add(res);
			}
		}
		
		for (Integer integer : result) {
			System.out.print(integer+" ");
		}
		
	}
}

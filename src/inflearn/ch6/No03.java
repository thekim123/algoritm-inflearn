package inflearn.ch6;

import java.util.Scanner;

public class No03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int temp, j;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > temp) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = temp;
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}

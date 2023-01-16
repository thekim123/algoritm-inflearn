package ch8;

import java.util.Arrays;
import java.util.Scanner;

public class No05 {
    static int desireCoin;
    static int[] arr;
    static int answer;

    static void DFS(int lev, int sum) {
        if (sum > desireCoin) return;
        if (lev >= answer) return;

        if (sum == desireCoin) {
            if (answer > lev && lev != 0) {
                answer = lev;
            }
            return;
        } else {
            for (int i = arr.length - 1; i >= 0; i--) {
                DFS(lev + 1, sum + arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        desireCoin = sc.nextInt();

        answer = Integer.MAX_VALUE;
        DFS(0, 0);
        System.out.println(answer);
    }
}

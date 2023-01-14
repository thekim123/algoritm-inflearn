package ch8;

import java.util.Scanner;

public class No03 {

    static int maxTime;
    static int answer = 0;

    static void DFS(int[][] arr, int lev, int sum, int t) {
        if (t > maxTime) {
            return;
        }

        if (sum > answer) {
            answer = sum;
        }

        if (lev < arr.length) {
            DFS(arr, lev + 1, sum, t);
            DFS(arr, lev + 1, sum + arr[lev][0], t + arr[lev][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        maxTime = sc.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        DFS(arr, 0, 0, 0);
        System.out.println(answer);
    }
}

package ch8;

import java.util.Scanner;

public class No06 {

    static int sum;
    static int[][] combination;

    static void DFS(int n, int r) {
        if (combination[n][r] != 0) {
            sum += combination[n][r];
            return;
        }

        if (r == 0 || r == n) {
            sum += 1;
            combination[n][r] = 1;
            return;
        } else {
            DFS(n - 1, r - 1);
            DFS(n - 1, r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        sum = 0;

        combination = new int[n + 1][n + 1];

        DFS(n, r);
        System.out.println(sum);
    }
}

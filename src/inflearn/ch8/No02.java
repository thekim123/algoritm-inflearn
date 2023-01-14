package ch8;

import java.util.Scanner;

public class No02 {

    static int level = 0;
    static int total;
    static int answer = 0;

    static void DFS(int lev, int sum, int[] arr) {
        if (sum > total) {
            return;
        }

        if (answer < sum) {
            answer = sum;
        }

        if (lev < arr.length) {
            DFS(lev + 1, sum, arr);
            DFS(lev + 1, sum + arr[lev], arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        total = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        DFS(0, 0, arr);
        System.out.println(answer);
    }


}

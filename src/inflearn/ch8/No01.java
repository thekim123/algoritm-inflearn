package ch8;

import java.util.Scanner;

public class No01 {
    static boolean check = false;
    static String answer = "NO";
    static int total;

    static void DFS(int lev, int sum, int[] arr) {
        if (check) {
            return;
        }

        if (lev < arr.length) {
            if (total - sum == sum) {

                answer = "YES";
                check = true;
            } else {
                DFS(lev + 1, sum, arr);
                DFS(lev + 1, sum + arr[lev], arr);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        DFS(0, 0, arr);
        System.out.println(answer);
    }


}

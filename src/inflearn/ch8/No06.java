package ch8;

import java.util.Scanner;

public class No06 {

    static int[] answer;

    static void DFS(int[] arr, int[] check, int m, int lev) {
        if (m == lev) {
            for (int i = 0; i < answer.length; i++) {
                System.out.printf(answer[i]+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            answer[lev] = arr[i];
            if (check[i]==1){
                continue;
            }
            check[i] = 1;
            DFS(arr, check, m, lev + 1);
            check[i] = 0;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] check = new int[n];

        int[] arr = new int[n];
        answer = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        DFS(arr, check, m, 0);
    }
}

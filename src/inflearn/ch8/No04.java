package ch8;

import java.util.Scanner;

public class No04 {

    static int maxSize;
    static int maxNumber;
    static int[] arr;

    static void DFS(int lev) {
        if (lev == maxSize) {
            for (int i : arr) {
                if (i != 0) System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= maxNumber; i++) {
                arr[lev] = i;
                DFS(lev + 1);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        maxNumber = sc.nextInt();
        maxSize = sc.nextInt();

        arr = new int[maxSize];
        DFS(0);
    }
}

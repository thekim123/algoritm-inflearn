package ch8;

import java.util.Arrays;
import java.util.Scanner;

public class No10 {

    static int[][] arr = new int[9][9];
    static int count;
    static int lev;

    static void DFS(int x, int y) {
        System.out.println(count);
        if (!isWithinRange(x, y) || arr[x][y] == 1) return;

        if (arr[x][y] == lev) {
            return;
        }

        if (x == 7 && y == 7) {
            count++;
            lev--;
            return;
        }

        arr[x][y] = lev;

        DFS(x + 1, y);
        DFS(x, y + 1);
        DFS(x - 1, y);
        DFS(x, y - 1);
    }

    public static void main(String[] args) {
        count = 0;
        lev = 1000;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        DFS(1, 1);
        System.out.println("count : " + count);
    }

    private static boolean isWithinRange(int x, int y) {
        return x > 0 && x < 8 && y > 0 && y < 8;
    }
}

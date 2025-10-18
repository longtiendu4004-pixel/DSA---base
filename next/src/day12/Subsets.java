package day12;

import java.util.*;

public class Subsets {// Rất đáng suy nghĩ
    static int n;
    static int[] a;

    public static void backtrack(int i) {
        if (i == n) {
            // In ra 1 tập con
            System.out.print("{ ");
            for (int j = 0; j < n; j++)
                if (a[j] == 1) System.out.print((j + 1) + " ");
            System.out.println("}");
            return;
        }

        // Không chọn phần tử i
        a[i] = 0;
        backtrack(i + 1);

        // Chọn phần tử i
        a[i] = 1;
        backtrack(i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        n = sc.nextInt();
        a = new int[n];
        backtrack(0);
    }
}

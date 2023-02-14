package lesson1;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] arrN = inputArray(n, sc);
        long[] arrK = inputArray(k, sc);

        for (int i = 0; i < arrK.length; ++i) {
            if (binarySearch(arrN, arrK[i]) != -1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static int binarySearch(long[] arr, long el) {
        int l = -1;
        int r = arr.length;
        while (l + 1 < r) {
            int m = (l + r) / 2;
            if (arr[m] > el) {
                l = m;
            } else {
                r = m;
            }
        }
        return l;
    }

    private static long[] inputArray(int size, Scanner sc) {
        long[] arr = new long[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}

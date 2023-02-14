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
            if (binarySearch(arrN, arrK[i], 0, arrN.length-1) != -1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static int binarySearch(long[] arr, long el, int low, int high) {
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < el) {
                low = mid + 1;
            } else if (arr[mid] > el) {
                high = mid - 1;
            } else{
                index = mid;
                break;
            }
        }
        return index;
    }

    private static long[] inputArray(int size, Scanner sc) {
        long[] arr = new long[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}

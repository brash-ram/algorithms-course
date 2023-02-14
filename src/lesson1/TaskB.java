package lesson1;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] sortedArr = inputArray(n, sc);
        long[] queries = inputArray(k, sc);
        for (int i = 0; i < k; i++) {
            long query = queries[i];
            int leftInd = binarySearch(sortedArr, query, -1, n);
            System.out.println(Math.min(sortedArr[leftInd], sortedArr[leftInd+1]));
        }
    }

    private static long[] inputArray(int size, Scanner sc) {
        long[] array = new long[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    private static int binarySearch(long[] sortedArray, long valueToFind, int low, int high) {
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedArray[mid] < valueToFind && sortedArray[mid+1] > valueToFind) {
                index = mid;
                break;
            } else if (sortedArray[mid] < valueToFind) {
                low = mid + 1;
            } else if (sortedArray[mid] > valueToFind) {
                high = mid - 1;
            } else {
                index = mid;
                break;
            }
        }
        return index;
    }
}



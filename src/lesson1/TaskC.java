package lesson1;

import java.util.Objects;
import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.nextLine();
        System.out.println(n / 2);
        System.out.flush();
        customBinarySearch(sc, n, n/2);
    }

    private static void customBinarySearch(Scanner sc, long n, long mid) {
        long l = 0L, r = n;
        while (l <= r) {
            String status = sc.nextLine();
            if (Objects.equals(status, "<")) {
                l = mid + 1;
            } else {
                r = mid + 1;
            }
            mid = (r - l) / 2;
            System.out.println(mid);
            System.out.flush();
        }
        System.out.println("!" + mid);
    }
}

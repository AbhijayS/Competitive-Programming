package codeforces;

import java.util.*;

class _959A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // even - odd = odd
        // odd - even = odd
        // even - even = even
        // odd - odd = even
        if (n == 1) {
            System.out.println("Ehab");
        } else if (n%2==0) {
            System.out.println("Mahmoud");
        } else {
            System.out.println("Ehab");
        }
        scanner.close();
    }
}
package codeforces;

import java.util.BitSet;
import java.util.Scanner;

class _935A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BitSet divisors = new BitSet(n+1);
        divisors.set(1, true);
        divisors.set(n, true);

        int i = 2;
        while(!divisors.get(i)) {
            if (n % i == 0) {
                divisors.set(i, true);
                divisors.set(n/i, true);
            }
            i++;
        }
        
        System.out.println(divisors.cardinality()-1);
        scanner.close();
    }
}
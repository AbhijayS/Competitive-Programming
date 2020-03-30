package codeforces;

import java.util.*;

class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double L = scanner.nextInt();
        double B = scanner.nextInt();

        int count = 1;
        while (Math.pow(1.5, count) <= B / L)
            count++;
        System.out.println(count);

        scanner.close();
    }
}
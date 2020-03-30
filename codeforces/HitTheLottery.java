package codeforces;

import java.util.*;

class HitTheLottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int bills = 0;

        bills += n / 100;
        n %= 100;

        bills += n / 20;
        n %= 20;

        bills += n / 10;
        n %= 10;

        bills += n / 5;
        n %= 5;

        bills += n;

        System.out.println(bills);

        scanner.close();
    }
}
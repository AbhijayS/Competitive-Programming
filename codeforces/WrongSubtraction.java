package codeforces;

import java.util.Scanner;

class WrongSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        for (int i = 0; i < K; i++) {
            N = subtractOne(N);
        }
        System.out.println(N);
        scanner.close();
    }

    static int subtractOne(int original) {
        if (original % 10 == 0)
            return original /= 10;
        return original - 1;
    }
}
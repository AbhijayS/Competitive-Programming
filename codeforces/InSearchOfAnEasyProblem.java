package codeforces;

import java.util.*;

class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean easy = true;

        for (int i = 0; i < n && easy; i++) {
            if (scanner.nextInt() == 1)
                easy = false;
        }

        System.out.println(easy ? "EASY" : "HARD");

        scanner.close();
    }
}
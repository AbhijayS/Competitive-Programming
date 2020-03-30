package codeforces;

import java.util.*;

class Hulk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String output = "I hate ";

        for (int i = 1; i < n; i++) {
            if (i%2 == 0)
                output += "that I hate ";
            else
                output += "that I love ";
        }
        System.out.println(output+"it");

        scanner.close();
    }
}
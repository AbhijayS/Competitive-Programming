package kickstart;

import java.util.Arrays;
import java.util.Scanner;

class Allocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 1; i <= T; i++) {
            int H = scanner.nextInt();
            int B = scanner.nextInt();
            // System.out.println("Houses: " + H);
            // System.out.println("Budget: " + B);
            int[] houses = new int[H]; 
            int[] frequency = new int[100000];
            
            for (int j = 0; j < H; j++) {
                houses[j] = scanner.nextInt();
            }

            for (int j : houses) {
                frequency[j-1] += 1;
            }

            int count = 0;
            boolean done = false;
            for (int j = 0; j < frequency.length && !done; j++) {
                for (int k = 0; k < frequency[j] && !done; k++) {
                    if (B < j+1) {
                        done = true;
                    } else {
                        count++;
                        B -= (j+1);
                    }
                }
            }
            System.out.println("Case #"+i+": " + count);
        }
        scanner.close();
    }
}
package codechef;

import java.util.Scanner;

class NUM239 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {

            // O(1) solution
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            int sets = (end - start + 1) / 10;
            int num2 = sets;
            int num3 = sets;
            int num9 = sets;

            for (int j = start + sets * 10; j <= end; j++) {
                if (j % 10 == 2)
                    num2++;
                else if (j % 10 == 3)
                    num3++;
                else if (j % 10 == 9)
                    num9++;
            }

            System.out.println(num2 + num3 + num9);

            // O(n) solution
            // num2 = 0;
            // num3 = 0;
            // num9 = 0;

            // for (int j = start; j <= end; j++) {
            // if (j%10 == 2)
            // num2++;
            // else if (j%10 == 3)
            // num3++;
            // else if (j%10 == 9)
            // num9++;
            // }

            // System.out.println(num2+num3+num9);

        }
        scanner.close();
    }
}
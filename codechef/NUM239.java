package codechef;

import java.util.Scanner;

class NUM239 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            
            int sets = (end-start+1)/10;
            int num2 = sets;
            int num3 = sets;
            int num9 = sets;

            for (int j = start+sets*10; j <= end; j++) {
                if (j%2 == 0)
                    num2++;
                else if (j%3 == 0)
                    num3++;
                else if (j%9 == 0)
                    num9++;
            }

            System.out.println(num2+num3+num9);
        }
    }
}
package codeforces;

import java.util.*;

class _1220A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z = 0, e = 0, r = 0, o = 0, n = 0;
        int len = scanner.nextInt();
        String input = scanner.next();
        System.out.println(input);
        for (int i = 0; i < len; i++) {
            switch(input.charAt(i)) {
                case 'z': z++; break;
                case 'e': e++; break;
                case 'r': r++; break;
                case 'o': o++; break;
                case 'n': n++; break;
            }
        }
        int ones = Math.min(o, Math.min(n,e));
        o=Math.max(0,o-ones);
        n=Math.max(0,n-ones);
        e=Math.max(0,e-ones);
        int zeros = Math.min(z, Math.min(e,Math.min(r,o)));
        String output = "";
        for(int i = 0; i < ones; i++) {
            output += "1 ";
        }
        for(int i = 0; i < zeros; i++) {
            output += "0 ";
        }
        System.out.println(output);
        scanner.close();
    }
}
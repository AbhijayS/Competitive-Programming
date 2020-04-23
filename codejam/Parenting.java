package codejam;
/*
 * I'm able to successfully test a Java solution without any
 * compilation or runtime errors for all inputs 2>=N>=10.
 * However, I receive a runtime error (test case skipped)
 * when I officially submit the code. The code isn't super
 * optimized (i.e. it should rather timeout than have a
 * runtime error). Any help would be much appreciated :)
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Scanner;

public class Parenting {
    public static void main(String[] args) throws Exception {
        int SIZE = 1441;
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            int N = scanner.nextInt();
            String answer = "";
            ArrayList<BitSet> slots = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                int s = scanner.nextInt();
                int e = scanner.nextInt();
                BitSet b = new BitSet(SIZE);
                for (int k = s; k < e; k++) {
                    b.set(k,true);
                }
                slots.add(b);
            }
            if (N == 2) {
                answer = "CJ";
            }else {
                boolean done = false;
                String other = "C";
                for (int j = 0; j < N-2 && !done; j++) {
                    BitSet a = slots.get(j);
                    for (int k = j+1; k < N && !done; k++) {
                        BitSet b = slots.get(k);
                        BitSet t = (BitSet)a.clone();
                        t.and(b);
                        if (t.cardinality() > 0) {
                            if (other.charAt(j)=='C')
                                other+="J";
                            else
                                other+="C";
                            for (int l = k+1; l < N && !done; l++) {
                                BitSet t2 = (BitSet)t.clone();
                                BitSet c = slots.get(l);
                                t2.and(c);
                                if (t2.cardinality() > 0)
                                    done = true;
                            }
                        }
                    }
                }
                if (done)
                    answer = "IMPOSSIBLE";
                else {
                    int r = N-other.length();
                    for(int m = 0; m < r; m++) {
                        other+="C";
                    }
                    answer = other;
                }
            }
            System.out.printf("Case #%d: %s\n", i, answer);
        }
        scanner.close();
    }
}
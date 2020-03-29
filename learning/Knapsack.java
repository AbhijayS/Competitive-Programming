/*
 * Source: https://www.youtube.com/watch?v=jqJ5s077OKo&t=616s
 * Given N<=1000 numbers,
 * if there is a subset with sum exactly equal to S,
 * return 'YES'
 * otherwise return 'NO'
 */

package learning;

class Knapsack {
    static final int S = 14;
    static final int[] INPUTS = { 1, 2, 4, 7, 8 };

    public static void main(String[] args) {
        // approach 1
        // the naive approach is to check all possible combinations
        // but that's too simple to implement

        // approach 2
        // one clever approach is to make a boolean array of size S
        // to represent numbers from 0 - S
        // each of these numbers represents a subset sum
        // that can be created using the given N inputs
        // each value in the boolean array
        // shows whether or not a particular sum is possible
        // [0, 1, 2, 3, 4, ... W-1, W]
        // for example, the 4th index (representing a sum of 3)
        // will be marked true
        // since the INPUT array contains values 1 and 2
        // and 1 + 2 = 3
        // similarly, the 0th index is marked true by default
        // because a sum of 0 is possible no matter what
        boolean[] allPossibleSubsetSums = new boolean[S + 1];
        allPossibleSubsetSums[0] = true;
        // iterate through all the inputs
        for (int i = 0; i < INPUTS.length; i++) {
            int input = INPUTS[i];
            // now we are going to check off whether a subset sum is possible
            // we have to traverse backwards through the array
            // so that we don't accidently add twice
            for (int j = S; j >= input; j--) {
                if (allPossibleSubsetSums[j - input])
                    allPossibleSubsetSums[j] = true;
            }
            // we can print the boolean array
            // to view the result of checking all possible subset sums
            // after considering an input
            // System.out.println(Arrays.toString(allPossibleSubsetSums));
        }
        // now we just return 'YES' if we found the subset sum of S
        // or 'NO' if we didn't
        System.out.println(allPossibleSubsetSums[S] ? "YES" : "NO");

        // approach 3
        // we can actually simplify the code and make it faster
        // by using bitsets instead
        // however we will need to do it using C/C++
        // because bitsets in java do not support right or left shifts
        // we can implement a bitset instead of the boolean array
        // and instead of checking all possible subset sums for each input
        // we can create a copy of the bitset and
        // right shift the bitset an amount equal to the input
        // and perform a logical or with the original bitset
        // follow is the partial sudo code
        // BitSet allPossibleSumsBitSet = new BitSet(S+1);
        // allPossibleSumsBitSet.set(0,true);
        // for (int i = 0; i < INPUTS.length; i++) {
        // int input = INPUTS[i];
        // copy = allPossibleSumsBitSet >> input
        // allPossibleSumsBitSet |= copy
        // }
    }
}
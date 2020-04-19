/*
 * Problem Source: https://www.geeksforgeeks.org/find-if-there-is-a-subarray-with-0-sum/
 * 
 * Problem Statement:
 * Find if there is a subarray with 0 sum
 * Given an array of positive and negative numbers,
 * find if there is a subarray (of size at-least one) with 0 sum.
 * 
 * Solution:
 * If a prefix-sum has been seen before,
 * there exists a subarray with zero sum.
 * We use a hashset to keep track of all prefix sums.
 */
package learning.prefix_sum;

import java.util.HashSet;
import java.util.Set;

public class SubarrayZeroSum {
    public static void main(String[] args) {
        int[] a = {4, 2, 0, 1, 6};
        Set<Integer> sums = new HashSet<>();

        int sum = 0;

        for(int i : a) {
            sum += i;
            if (i==0 || sums.contains(sum)) {
                System.out.println(true);
                return;
            } else {
                sums.add(sum);
            }
        }
        System.out.println(false);
    }
}
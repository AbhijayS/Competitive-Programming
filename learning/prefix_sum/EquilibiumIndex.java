/*
 * Problem Statement: https://www.geeksforgeeks.org/equilibrium-index-of-an-array/
 * Solution:
 * Since there are two halves (left and right),
 * we can compare each half and ignore the 'pivot' point.
 * Time complexity can be reduced if the sum of all
 * elements of the array has been pre-determined because
 * the right half can be infered if the sum of the left half
 * is known.
 */
package learning.prefix_sum;

class EquilibriumIndex {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int sum = 0;
        for(int i : a) {
            sum += i;
        }

        for(int i = 1; i < a.length; i++) {
            if (a[i-1] == sum-a[i-1]-a[i]) {
                System.out.println(i);
                return;
            }
            a[i]+=a[i-1];
            // System.out.println(Arrays.toString(a));
        }
        System.out.println(-1);
    }
}
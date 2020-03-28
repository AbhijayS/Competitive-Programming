import java.util.BitSet;

/*
 * Source: https://youtu.be/jqJ5s077OKo?list=PLl0KD3g-oDOHpWRyyGBUJ9jmul0lUOD80&t=495
 * Problem: You are given N <= 10^7 numbers, each between 0 and 10^9. How many different values appear in the sequence?
 */

class DifferentNumbers {
    static final int LARGEST_NUMBER = 1000000000;
    public static void main(String[] args) {
        // one approach is to make an array of these numbers
        // and sort them in ascending or descending order
        // the sorting opperation would have O(nlogn) time complexity
        // after the array is sorted each element of the array must be traversed
        // to count the number of unique numbers

        // this problem can be solved in O(n)
        // if we make a boolean array of size 10^9
        // however since booleans are usually 1 byte each
        // the array would occupy over 1GB in memory

        // the fastest method and most memory efficient way
        // is to create a bitset of size 10^9
        // to keep track of all the numbers
        // the smallest possible number is 0
        // the largest possible number is 10^9
        // we can check off whether or not we have seen a number in the bitset

        int[] numbers = {3, 5, 6, 3, 3, 9, 5};
        BitSet bitSet = new BitSet(LARGEST_NUMBER+1);
        
        for (int n : numbers) {
            if (bitSet.get(n) == false) {
                bitSet.set(n, true);
            }
        }
        
        System.out.println(bitSet.cardinality());
    }
}
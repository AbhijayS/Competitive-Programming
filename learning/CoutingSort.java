package learning;

import java.util.HashMap;

/*
 * Counting Sort
 * Fast algorithm that works in O(n) time
 * Usually faster than traditional O(nlogn) algorithms for small inputs
 */
class CountingSort {
    public static void main(String[] args) {
        int[] array = {1, 4, 1, 2, 7, 5, 2};

        // since we already know the order of numbers
        // i.e. 0 then 1 then 2 etc ...
        // the final sorted list should be in a similar increasing order
        // we can keep track of how many times a number appears in the list
        // then infer the position of any particular number
        // in the final, sorted format
        //
        // pseudocode:
        // 1. smallest_number, biggest_number, total_numbers
        // 2. map = frequency of all numbers between smallest & biggest number
        // 3. filter out all numbers with frequency = 0
        // 4. index = total_numbers
        // 5. for each element in map (backwards):
        // 6.   index = index - frequency of element
        // 7.   position of element = index
        //
        // code:
        int biggestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        for (int i : array) {
            if (i > biggestNumber)
                biggestNumber = i;
            if (i < smallestNumber)
                smallestNumber = i;
        }
        HashMap<Integer, Integer> frequencyRecord = new HashMap<>();
        for (int i = smallestNumber; i <= biggestNumber; i++) {
            frequencyRecord.put(i, 0);
        }
        // record how many times a number appears in the input
        for (int i = 0; i < array.length; i++) {
            int before = frequencyRecord.get(array[i]);
            frequencyRecord.put(array[i], before+1);
        }
        // remove numbers that don't appear at all
        for (int i = smallestNumber; i <= biggestNumber; i++) {
            if (frequencyRecord.get(i) == 0) {
                frequencyRecord.remove(i);
            }
        }
        System.out.println("Count: " + frequencyRecord);
        // since we know how many total numbers there are in the input array
        // infer the position by traversing backwards through the records
        // for example, the biggest number's position would be
        // total_numbers - biggest_number_frequency
        int count = array.length;
        for (int i = biggestNumber; i >= smallestNumber; i--) {
            if (frequencyRecord.containsKey(i)) {
                int before = frequencyRecord.get(i);
                count -= before;
                frequencyRecord.put(i, count);
            }
        }
        System.out.println("Position: " + frequencyRecord);
    }
}
package learning.prefix_sum;

import java.util.Arrays;

public class SubarraySum {
    public static void main(String[] args) {
        int arr[] = {};
        int target = 0;

        // if sum == target
        //  found
        // if sum < target
        //  add next i
        // if sum > target
        //  remove last i
        int sum, i, start, end;
        sum = i = start = end = 0;
        while(true) {
            if (sum == target) {
                System.out.println(sum==0?-1:Arrays.toString(new int[] {start, end}));
                break;
            }else if (sum < target) {
                if (i==arr.length) {
                    System.out.println(-1);
                    break;
                }
                sum += arr[i];
                end = i;
                i++;
            } else {
                sum -= arr[start];
                start += 1;
            }
        }
    }
}
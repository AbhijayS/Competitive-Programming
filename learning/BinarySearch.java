package learning;

class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 6, 8, 10, 12};
        System.out.println(find(array, 13));
    }

    /*
     * Binary Search implementation
     */
    public static int find(int[] array, int value) {
        int left = 0;
        int right = array.length-1;
        int middle = (right-left)/2;
        while (true) {
            // checks if value doesn't exist in the array
            if (right < left) {
                return -1;
            }
            if (value == array[middle]) {
                return middle;
            } else if (value < array[middle]) {
                right = middle-1;
            } else {
                left = middle+1;
            }
            // middle = (left+right)/2
            // this alternate formula could result in an overflow
            // if (left + right) > Integer.MAX_VALUE

            // much safer
            middle = left + ((right-left)/2);
        }
    }
}
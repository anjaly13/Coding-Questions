package arrays.maxsubarray;

public class MaxSubArray {

    /**
     * Brute force 2 loops
     * optimal 'Kaiden's Algorithm'
     * time O(n)
     * space O(1)
     *
     * Kaiden's algo : pick either (current sum + current value) or current value
     * @param array
     * @return
     */
    public static int maxSubArray(int[] array) {

        int currentSum = array[0];
        int maxSum = array[0];

        for(int index=1;index < array.length; index++){
            if (array[index] > (array[index] + currentSum)){
                currentSum = array[index];
                maxSum = Math.max(maxSum,currentSum);
            }
            else{
                currentSum = currentSum + array[index];
                maxSum = Math.max(maxSum,currentSum);
            }
        }

        return maxSum;
    }
}

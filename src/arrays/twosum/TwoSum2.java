package arrays.twosum;

import java.util.Arrays;

public class TwoSum2 {

    /**
     * using 2 pointers
     * time O(nlog n)
     * space O(n)
     * @param array
     * @param targetSum
     * @return
     */
    public static int[] twoSum(int[] array, int targetSum) {
        int left = 0;
        int right = array.length - 1;

        Arrays.sort(array);
        while(left < right){
            int sum = array[left] + array[right];
            if (sum == targetSum){
                return new int[]{array[left],array[right]};
            }
            else if(sum > targetSum){
                right--;
            }
            else {
                left ++;
            }
        }
        return new int[0];
    }
}

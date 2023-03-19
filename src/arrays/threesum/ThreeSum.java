package arrays.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    /**
     * Brute force 3 loops
     * time O(n^3) space O(1)
     *
     * 2 loops and hashtable
     * time O(n^2) space O(n)  : Possibility of duplicate elements
     *
     * optimal
     * time O(n^2)
     * space O(n)
     *
     * @param nums
     */
    public static List<Integer[]> main(int[] nums) {

        List<Integer[]> output = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0;i< nums.length - 2;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0){
                    output.add( new Integer[]{nums[i], nums[left], nums[right]});
                    left ++;
                    right --;
                } else if (sum < 0) {
                    left++;
                }else {
                    right--;
                }

            }
        }
        return output;
    }
}

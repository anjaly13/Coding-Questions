package arrays.minimuminrotatedsorted;

public class MinimumInRotatedSorted {

    /**
     * brute force: looping once with time O(n) and space O(1)
     * optimal: Using binary search algo
     * time O(log n)
     * space o(1)
     * @param nums
     * @return
     */
    public static int main(int[] nums) {
        int right = nums.length-1;
        int left = 0;
        int minimum = Integer.MAX_VALUE;

        while (left <= right){
            int m = (left + right)/2;
            minimum = Math.min(minimum,nums[m]);
            if(nums[left] < nums[right]){
                right = m-1;
            }
            else {
                left = m+1;
            }
        }

        return minimum;
    }
}

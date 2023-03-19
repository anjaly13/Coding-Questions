package arrays.searchinrotatedsorted;

public class SearchInRotatedSorted {

    /**
     * brute force time O(n) space O(1)
     * optimal: binary search
     * time O(log n)
     * space O(1)
     *
     * @param nums
     * @param target
     */
    public static void main(String args[]) {

        int[] nums = new int[]{45, 61, 71, 72, 73, 0, 1, 21, 33, 37};
        int target = 33;
        int left = nums[0];
        int right = nums.length-1;
        shifted(nums,target,left,right);

    }

    public static int shifted (int[] nums, int target, int left, int right){


        while(left <= right){
            System.out.println(left);
            System.out.println(right);
            int mid = (left + right)/2;
            System.out.println(mid);
            System.out.println("------");
            if(nums[mid] == target){
                System.out.println(mid);
                return mid;
            } else if (nums[left] <= nums[mid]) {
                if(target >= nums[left] && target < nums[mid]){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }else {
                if(target > nums[mid] && target <= nums[right]){
                    left = mid +1;
                }
                else{
                    right = mid -1;
                }
            }
        }
        System.out.println(-1);
        return -1;
    }
}

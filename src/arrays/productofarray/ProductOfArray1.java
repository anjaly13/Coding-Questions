package arrays.productofarray;

public class ProductOfArray1 {

    /**
     * Optimal
     * time O(n)
     * space O(n)
     *    [5, 1, 4, 2]
     * after the first iteration [1, 5, 5, 20]
     * after the second iteration [8, 40, 10, 20]
     * @param nums
     * @return
     */

    public static int[] main(int[] nums) {
        int[] products = new int[nums.length];
        int leftRightProducts = 1;
        // taking the products of each element from left to right
        for (int left = 0;left< nums.length;left++){
            products[left] = leftRightProducts;
            leftRightProducts = leftRightProducts * nums[left];
        }
        leftRightProducts = 1;
        // taking the product of each element from left to right and multiply it with the above result
        for (int right = nums.length-1; right >= 0 ; right --){
            products[right] = products[right] * leftRightProducts;
            leftRightProducts = leftRightProducts * nums[right];
        }

        return products;
    }
}

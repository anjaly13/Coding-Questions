package arrays.productofarray;

public class ProductOfArray {

    /**
     * Brute force
     * time O(n^2)
     * space O(n)
     * @param nums
     * @return
     */
    public static int[] main(int[] nums) {
        int [] products = new int[nums.length];
        for(int first=0;first < nums.length;first++){
            int product = 1;
            for (int next=0;next < nums.length;next++){
                if(first == next){
                    continue;
                }
                product = product * nums[next];
            }
            products[first] = product;
        }
        return products;
    }
}

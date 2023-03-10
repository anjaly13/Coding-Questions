package arrays.duplicate;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {
    /**
     * Brute force is time O(n^2) and O(1) space
     */

    /**
     * time O(n)
     * space O(n)
     * @param nums
     * @return
     */
    public static boolean main(int[] nums) {

        Map<Integer, Boolean> numberMap = new HashMap<>();
        for (int num : nums){
            if (numberMap.containsKey(num)){
                return true;
            }
            numberMap.put(num,true);
        }
        return false;
    }
}

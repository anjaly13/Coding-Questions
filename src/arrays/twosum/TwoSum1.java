package arrays.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

    /**
     * using map
     * time O(n)
     * space O(n)
     * @param array
     * @param targetSum
     * @return
     */
    public static int[] twoSum(int[] array, int targetSum) {
        Map<Integer,Boolean> savedElements = new HashMap<>();
        for (int element : array){
            if(savedElements.containsKey(targetSum - element)){
                return new int[] {element, targetSum - element};
            }
            savedElements.put(element,true);
        }
        return new int[0];
    }
}

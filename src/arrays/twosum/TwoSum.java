package arrays.twosum;

public class TwoSum {

    /**
     * using 2 loops
     * time O(n^2)
     * space O(1)
     * @param array
     * @param targetSum
     * @return
     */
    public static int[] twoSum(int[] array, int targetSum) {
        // Write your code here.
        for(int firstElement =0; firstElement < array.length -1; firstElement++){
            for(int next = firstElement + 1;next < array.length;next++){

                if(array[firstElement] + array[next] == targetSum){
                    return new int []{array[firstElement],array[next]};
                }

            }
        }
        return new int[0];
    }
}

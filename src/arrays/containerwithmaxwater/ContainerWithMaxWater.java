package arrays.containerwithmaxwater;

public class ContainerWithMaxWater {

    /**
     * brute force time O(n^2) space 0(1)
     *
     * optimal
     * time O(n) space O(1)
     * @param height
     * @return
     */
    public static int main(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right){
            int area = Math.min(height[left],height[right]) * (right - left);
            maxArea = Math.max(maxArea,area);
            if(height[left] <= height[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxArea;

    }
}

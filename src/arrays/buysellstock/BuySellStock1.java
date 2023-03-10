package arrays.buysellstock;

public class BuySellStock1 {

    /**
     * time O(n)
     * space O(1)
     * @param prices
     * @return
     */
    public static int main(int[] prices) {
        int minProfit = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices){
            if (price < minProfit){
                minProfit = price;
            }else if (price - minProfit > maxProfit){
                    maxProfit = price - minProfit;
            }
        }
        return maxProfit;
    }
}

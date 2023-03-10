package arrays.buysellstock;

public class BuySellStock {

    /**
     * brute force
     * time O(n^2)
     * space O(1)
     * @param prices
     */
    public static int main(int[] prices) {

        int maxProfit = 0;
        for(int first=0;first< prices.length-1;first++){
            for (int next = first+1;next< prices.length;next++){
                int profit = next-first;
                if (profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}

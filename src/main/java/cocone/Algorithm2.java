package cocone;

public class Algorithm2 {

    public int solution(int[] prices) {

        // 全組み合わせの利益を算出して、最大値を取得する
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {

                // String logMessage = "prices[" + j + "] - prices[" + i + "] = " + prices[j] + " - " + prices[i]; // for Debug
                // logMessage += " = " + (prices[j] - prices[i]); // for Debug

                int profit = prices[j] - prices[i];
                if (maxProfit < profit) {
                    maxProfit = profit;
                    // logMessage += " maxProfit is updated by " + maxProfit; // for Debug
                }
                // System.out.println(logMessage); // for Debug
            }
        }
        return maxProfit;

    }
}

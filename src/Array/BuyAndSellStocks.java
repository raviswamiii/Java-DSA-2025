package Array;

public class BuyAndSellStocks {

        public int maxProfit(int[] prices) {
            int minPrice = Integer.MAX_VALUE;
            int maxProfit = 0;

            for (int price : prices)  {
                if (price < minPrice) {
                    minPrice = price; // Update the lowest price
                } else {
                    int profit = price - minPrice;
                    if (profit > maxProfit) {
                        maxProfit = profit; // Update the max profit
                    }
                }
            }

            return maxProfit;
        }

        public static void main(String[] args) {
            int[] prices = {7, 1, 5, 3, 6, 4};
            BuyAndSellStocks bass = new BuyAndSellStocks();
            System.out.println("Max Profit: " + bass.maxProfit(prices)); // Output: 5
        }
    }


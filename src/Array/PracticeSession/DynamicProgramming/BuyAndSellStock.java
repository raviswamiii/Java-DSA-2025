package Array.PracticeSession.DynamicProgramming;

public class BuyAndSellStock {
    // Not a better approach:

//    public int buyAndSellStock(int[] prices){
//        int maxProfit = 0;
//        int maxPrice = 0;
//        int minPrice = Integer.MAX_VALUE;
//
//        for(int i = 0; i < prices.length; i++){
//            if(prices[i] < minPrice){
//                minPrice = prices[i];
//            } else{
//                if(prices[i] > maxPrice){
//                    maxPrice = prices[i];
//                    maxProfit = maxPrice - minPrice;
//                }
//            }
//
//        }
//        return maxProfit;
//    }
//
//    public static void main(String[] args){
//        int[] prices = {7,1,5,3,6,4};
//        BuyAndSellStock obj = new BuyAndSellStock();
//        int result = obj.buyAndSellStock(prices);
//        System.out.println("Maximum profit is: " + result);
//    }


    public int buyAndSellStock(int[] prices){
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            } else{
                int profit = prices[i] - minPrice;
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }

        }
        return maxProfit;
    }

    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        BuyAndSellStock obj = new BuyAndSellStock();
        int result = obj.buyAndSellStock(prices);
        System.out.println("Maximum profit is: " + result);
    }
}

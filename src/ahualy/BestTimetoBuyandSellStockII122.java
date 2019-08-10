package ahualy;

public class BestTimetoBuyandSellStockII122 {
    public static void main(String[] args) {

        //int[] prices = new int[]{7,1,5,3,6,4};
        //int[] prices = new int[]{1,2,3,4,5};
        int[] prices = new int[]{7,6,4,3,1};
        int res = maxProfit(prices);
        System.out.println(res);
    }

    private static int maxProfit(int[] prices) {

        int res = 0;
        for (int i = 0; i <prices.length-1 ; i++) {
          if (prices[i+1]>prices[i]){
              res += prices[i+1]-prices[i];
          }
        }

        return res;
    }

}

public class BuyAndSellStock {
    public int maximumProfit(int[] arr){
        int bestBuy = arr[0];
        int maxProfit = 0;
        for(int i=1; i<arr.length; i++){
            //check for max profit
            if(arr[i]>bestBuy){
                maxProfit = Math.max(maxProfit,arr[i]-bestBuy);
            }

            bestBuy = Math.min(bestBuy,arr[i]);
        }
        return maxProfit;
    }
}

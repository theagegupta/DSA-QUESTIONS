class StockBuyAndSell
{
    public static void main(String[] args) 
    {
        int arr[] = {7,2,5,3,6,4,3,2,1};
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        int maxSellPrice = Integer.MIN_VALUE;
        int minBuyPrice = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i] > buyPrice)
            {
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
                maxSellPrice = Math.max(arr[i],maxSellPrice);
                minBuyPrice = buyPrice;
            }

            else
            {
                buyPrice = arr[i];
            }
        }
            System.out.println("Min buy price: "+minBuyPrice+" Max sell price: "+maxSellPrice+" Max Profit: "+maxProfit);

    }
}

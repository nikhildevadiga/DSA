class Solution {
    public int maxProfit(int[] prices) {
        int low=10000;
        int high=0;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            
                if(prices[i]<low){
                    
                    low=prices[i];
                    }
                    high=prices[i]-low;
                    
                    
                
                if(high>profit){
                    profit=high;
                }
            
            
        }
        return profit;
    }
}
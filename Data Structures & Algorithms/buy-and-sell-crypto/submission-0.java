class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int pointer1 = 0;
        int pointer2 = 1;

        while(pointer2< prices.length){
            if(prices[pointer1]>=prices[pointer2]){
                pointer1 = pointer2;
            }else {
                max=Math.max(max,prices[pointer2]-prices[pointer1] );
            }
            pointer2++;
        }


        return max;
    }
}

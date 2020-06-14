public class Main {

    public static int maxProfit(int prices[]){
        return calculate(prices, 0);
    }

    public static int calculate(int prices[], int sales){
        if (sales >= prices.length)
            return 0;
        int max = 0;
        for (int start = sales; start < prices.length; start++) {
            int maxprofit = 0;
            for (int i = start + 1; i < prices.length; i++) {
                if (prices[start] < prices[i]) {
                    int profit = calculate(prices, i + 1) + prices[i] - prices[start];
                    if (profit > maxprofit)
                        maxprofit = profit;
                }
            }
            if (maxprofit > max)
                max = maxprofit;
        }
        return max;
    }

    public static void main(String[] args){
        int prices[] = {1,2,3,4,5};
        int n = prices.length;
        n = calculate(prices,n);

        System.out.println(maxProfit(prices));
    }
}

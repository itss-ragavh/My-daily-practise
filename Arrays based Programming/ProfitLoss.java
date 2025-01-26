import java.util.Arrays;

public class ProfitLoss {
   
    public static void main(String[] args) {
    
        int[]a={7,6,4,3,1};
        int[]b={7,1,5,3,6,4};
        int res1=maxProfit(a);
        int res2=maxProfit(b);
        System.out.println("The max profit of "+Arrays.toString(a)+" is "+res1);
        System.out.println("The max profit of "+Arrays.toString(b)+" is "+res2);
    }


        public static int maxProfit(int[] prices) {
            int minPrice = Integer.MAX_VALUE;
            int maxProfit = 0;
            
            for (int price : prices) {
               
                minPrice = Math.min(minPrice, price);
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            
            return maxProfit;
        }
    }
     


class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;
        
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        int res = high;

        while(low<= high){
            int guess = (low+ high)/2;
            long have = func(piles, guess);

            if(have > h){
                low = guess +1;
            }else{
                res = guess;
                high = guess -1;
            }
        }
        return res;

        
    }

   public long func(int[] piles, int guess) {

        long t = 0;

        for (int i = 0; i < piles.length; i++) {

            t += (piles[i] + guess - 1) / guess;

        }

        return t;
            
        }
    }

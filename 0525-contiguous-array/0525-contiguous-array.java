class Solution {
    public int findMaxLength(int[] nums) {
        int zero = 0;
        int one = 0;

        Map<Integer, Integer> f = new HashMap<>();
        f.put(0,-1);
        int res = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;

            }else{
                one++;
            }
            int diff = zero - one;

            if (!f.containsKey(diff)) {
                f.put(diff, i);
            } else {
                res = Math.max(res, i - f.get(diff));
            }

         
        }
        return res;
    }
}
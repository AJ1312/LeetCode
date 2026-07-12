class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);

        int slow=0;
        int fast=1;
        int a = nums[slow];

        for(int i=0; i<nums.length; i++){

            if(nums[slow]==nums[fast]){
                a = nums[slow];          
            }else{
                slow++;
                fast++;
            }
        }
    return a;
    }
}
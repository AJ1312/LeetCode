class Solution {
public:
    bool check(vector<int>& nums) {
    vector<int> nums2 = nums;
    sort(nums2.begin(), nums2.end());
    for(int i=0; i<nums.size(); i++){
        if(nums==nums2){
            return true;
            break;
        }else{
      for(int i=1; i< nums.size(); i++){
            int temp = nums[i-1];
            nums[i-1] = nums[i];
            nums[i] = temp;
      }
    }
    }

        return false;
    }
};
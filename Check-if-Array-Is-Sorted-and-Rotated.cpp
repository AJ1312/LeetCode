// class Solution {
// public:
//     bool check(vector<int>& nums) {
//     vector<int> nums2 = nums;
//     sort(nums2.begin(), nums2.end());
//     for(int i=0; i<nums.size(); i++){
//         if(nums==nums2){
//             return true;
//             break;
//         }else{
//       for(int i=1; i< nums.size(); i++){
//             int temp = nums[i-1];
//             nums[i-1] = nums[i];
//             nums[i] = temp;
//       }
//     }
//     }

//         return false;
//     }
// };
class Solution {
public:
    bool check(vector<int>& nums) {
        int n = nums.size(), drops = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] > nums[(i + 1) % n]) {
                drops++;
                if (drops > 1) return false;
            }
        }
        return true;
    }
};
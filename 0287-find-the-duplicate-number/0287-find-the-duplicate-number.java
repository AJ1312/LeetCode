class Solution {
    public int findDuplicate(int[] nums) {

        HashSet<Integer> a = new HashSet<>();
        int b = 0;

        for(int i: nums){
            if(a.contains(i)){
                return i;
            }else{
                a.add(i);
            }
        }
    return 0;  
    }
}
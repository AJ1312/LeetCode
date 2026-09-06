

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < 2 * nums.length; i++) {

            int index = i % nums.length;

            while (!st.isEmpty() && nums[index] > nums[st.peek()]) {
                res[st.pop()] = nums[index];
            }

            if (i < nums.length) {
                st.push(index);
            }
        }

        return res;
    }
}


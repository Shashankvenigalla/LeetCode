class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] st = new int[2*n];
        
        int top = 0;
        for(int i=n-1;i>=0;i--){
            st[top++] = nums[i];
        }

        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            while(top != 0 && st[top - 1] <= nums[i]){
                top--;
            }
            ans[i] = top == 0 ? -1 : st[top - 1];
            st[top++] = nums[i];
        }
        return ans;
    }
}
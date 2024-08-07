class Solution {
    public void moveZeroes(int[] nums) {
        int i =0, j=0, n=nums.length, t;
        for (i=0; i<n; i++) {
            if (nums[i]!=0) {
                if (i!=j) nums[j] = nums[i];
                j++;
            }
        }
        for (;j<n;j++) nums[j] = 0;
    }
}
class Solution {
    public void moveZeroes(int[] nums) {
        int i =0, j=0, n=nums.length;
        for (i=0; i<n; i++) {
            if (nums[i]!=0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i]=temp;
                j++;
            }
        }
        // for (;j<n;j++) {
        //     nums[j] = 0;
        //     }
    }
}
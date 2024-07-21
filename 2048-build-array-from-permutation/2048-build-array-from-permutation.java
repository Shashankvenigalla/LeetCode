class Solution {
    public int[] buildArray(int[] nums) {
        int[] nums1=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums1[i]=nums[nums[i]];
        }
        return nums1;
    }
}
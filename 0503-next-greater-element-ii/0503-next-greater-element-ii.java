class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        int[] da = new int[2*nums.length];
        for(int i = 0; i < nums.length; i++) {
            da[i] = nums[i];
        }
        int k = 0;
        for(int i = nums.length; i < da.length; i++) {
            da[i] = nums[k];
            k++;
        }
        for(int i = 0; i < nums.length; i++) {
            res[i] = -1;
            for(int j = i; j < da.length; j++) {
                if(da[j] > da[i]) {
                    res[i] = da[j];
                    break;
                }
            }
        }
        return res;}
}

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] num=new int[nums.length*2];
        System.arraycopy(nums,0,num,0,nums.length);
        System.arraycopy(nums , 0 ,num ,nums.length,nums.length);
        System.gc();
        return num;
    }
}
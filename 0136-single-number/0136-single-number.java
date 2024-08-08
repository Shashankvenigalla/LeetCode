class Solution {
    public int singleNumber(int[] nums) {
        int x=nums[0];
        return find(nums,1,2,x);
    }
    public int find(int[] arr,int i,int j,int x)
    {
        if(arr.length==i || arr.length==j) return x;
        x=x^arr[i]^arr[j];
        return find(arr,j+1,j+2,x);
    }
}
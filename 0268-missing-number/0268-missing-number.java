class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++) sum=sum+nums[i];
        int diff=n*(n+1)/2;
        return (diff-sum);
    }
}
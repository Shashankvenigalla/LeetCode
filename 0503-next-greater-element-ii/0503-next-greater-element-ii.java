class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            a[i]=-1;
            int j=(i+1)%nums.length;
            while(i!=j){
                if(nums[j]>nums[i]){
                    a[i]=nums[j];
                    break;
                }
                else{
                    j=(j+1)%nums.length;
                }
            }
        }return a;
        }
}
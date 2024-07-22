class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] num=new int[n*2];
        int start=0;
        int middle=n;
        for(int i=0;i<n*2-1;i++){
            num[i]=nums[start];
            i+=1;
            num[i]=nums[middle];
            start++;
            middle++;
        }return num;
    }
}
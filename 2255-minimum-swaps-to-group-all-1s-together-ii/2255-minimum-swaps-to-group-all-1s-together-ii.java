class Solution {
    public int minSwaps(int[] nums) {
        int totalSize = 0;
        for(int a: nums) if (a == 1) totalSize++;
        int n = nums.length;
        int i = 0 ;
        int j = totalSize-1;
        int swaps = 0;
        for(int c=i;c<=j;++c) if (nums[c] == 0) swaps++;
        int minSwaps = swaps;
        while(i < n )
        {
            if (nums[i] == 0) swaps--;
            i++;
            j++;
            if (nums[j%n] == 0) swaps++;
            minSwaps = Math.min(swaps,minSwaps); 
        }
        return minSwaps;
    }
}
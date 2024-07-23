class Solution {
  public static int[] frequencySort(int[] nums){
    HashMap<Integer, Integer> map = new HashMap();
    for(int num : nums){
        map.put(num, map.getOrDefault(num, 0)+1);
    
    }

    for(int i = 0; i<nums.length;i++){
        for(int j = 0; j<nums.length;j++){
            if(map.get(nums[i])<map.get(nums[j])){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
           
        }

    }
    
    for(int i =0; i<nums.length;i++){
        for(int j = 0; j<nums.length;j++){
            if(map.get(nums[i])==map.get(nums[j])){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    
    return nums;
}


}
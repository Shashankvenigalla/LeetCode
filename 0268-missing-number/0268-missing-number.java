class Solution {
     public static int missingNumber(int[] arr){
        int ans = arr.length;
        cyclicSort(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static void cyclicSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n;){
            if(arr[i] == n){
                i++;
            }
            else{
                if(arr[i] == i){
                    i++;
                }
                else{
                    swap(arr, arr[i], i);
                }
            }
        }
    }

    public static void swap(int[] arr, int expIndex, int indexOg){ 
        int temp = arr[indexOg];
        arr[indexOg] = arr[expIndex];
        arr[expIndex] = temp;
    }
}
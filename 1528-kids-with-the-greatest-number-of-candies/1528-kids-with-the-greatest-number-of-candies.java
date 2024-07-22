class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=findMaxValueofArray(candies);
        ArrayList<Boolean> arr=new ArrayList<Boolean>(candies.length);
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }return arr;
    }
    int findMaxValueofArray(int[] candies){
        int max=Integer.MIN_VALUE;
        for(int i: candies){
            if(max<i){
                max=i;
            }
        }
        return max;
    }
}
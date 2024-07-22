class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        ArrayList<Boolean> arr=new ArrayList<Boolean>(candies.length);
        for(int i: candies){
            if(max<i){
                max=i;
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }return arr;
    }
}
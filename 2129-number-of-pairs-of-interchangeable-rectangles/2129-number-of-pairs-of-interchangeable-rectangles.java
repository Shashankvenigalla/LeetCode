class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
      Map<Double,Long> map=new HashMap<>();
      long count=0;
      for(int[] num:rectangles){
       double a=num[0];
       double b=num[1];
       double division =(double) a/b;
       if(map.containsKey(division)){
        count+=map.put(division,map.get(division)+1);
       }else{
       map.put(division,1L);
       }
      }
      return count;

    }

}
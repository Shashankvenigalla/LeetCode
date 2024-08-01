class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        int sum=0;
        for(String i: details){
            sum=sum*10+i.charAt(11)-48;
            sum=sum*10+i.charAt(12)-48;
            if(sum>60){
                count++;
            }
            sum=0;
        }
        return count;
    }
}
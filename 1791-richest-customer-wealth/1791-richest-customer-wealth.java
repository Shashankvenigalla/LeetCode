class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for(int[] person: accounts){
            int sum=0;
            for(int account: person){
                sum=sum+account;
            }if (max<sum){
                max=sum;
                sum=0;
            }

        }return max;
    }
}
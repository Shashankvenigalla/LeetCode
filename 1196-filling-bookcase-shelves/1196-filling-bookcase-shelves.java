class Solution {
    int ans =Integer.MAX_VALUE;
    public int minHeightShelves(int[][] books, int shelfWidth) {
        int dp[] = new int [books.length];
        Arrays.fill(dp,-1);
        return solve(0,books, shelfWidth, dp);
    }
    public int solve(int i,int[] [] books,int shelfWidth,int dp[]){
        if(i>=books.length)
        return 0;
        int width=0;
        int maxH = 0;
        if(dp[i]!=-1){
            return dp[i];
        }
        for(int j=i;j<books.length;j++){
            width +=books[j][0];
            if (width > shelfWidth) break;
            maxH = Math.max(books[j][1],maxH);
            ans =  Math.min(ans,maxH + solve(j+1,books,shelfWidth, dp));
        }
        return dp[i]=ans;
    }
}
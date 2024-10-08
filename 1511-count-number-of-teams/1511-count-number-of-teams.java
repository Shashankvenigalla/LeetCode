class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int count = 0;
        int leftCount = 0;
        for(int mid = 1; mid < n-1; mid++) {
            int lsc = 0;
            for(int i = 0; i<mid; i++) {
                if(rating[i] < rating[mid]) {
                    lsc++;
                }
            }

            int rgc = 0;
            for(int i = mid+1; i<n; i++) {
                if(rating[i] > rating[mid]) {
                    rgc++;
                }
            }

            count += lsc * rgc;

            int lgc = mid-lsc;
            int rsc = n-mid-1 - rgc ;
            count += lgc * rsc;
        }
        return count;

    }
}
class Solution {
    public int maxProfit(int[] a) {
        int n=a.length;
        int minp=a[0];
        int mp=0;
        int ind=-1;
        for(int i=1;i<n;i++){
            minp=Math.min(a[i],minp);
            if(a[i]-minp>mp) mp=a[i]-minp;
        }
        return mp;
    }
}
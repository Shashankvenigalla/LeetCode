class Solution {
    public int secondMinimum(int n, int[][] edges, int time, int change) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
             adj.get(edge[1]).add(edge[0]);
        }
        int[] dist1 = new int[n+1];
        int[] dist2 = new int[n+1];
        Arrays.fill(dist1,Integer.MAX_VALUE);
        Arrays.fill(dist2, Integer.MAX_VALUE);
        dist1[1]=0;
        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{1, 0});
        while(!pq.isEmpty()) {
            int[] curr= pq.remove();
            int node = curr[0];
            int dist = curr[1];

            if(node==n && dist2[n]!=Integer.MAX_VALUE){
                return dist2[n];
            }
            if((dist/change)%2==1){
                dist = ((dist/change)+1)*change;
            }
            dist+=time;
            for(int nbr: adj.get(node)){
                if(dist<dist1[nbr]){
                    dist2[nbr] =dist1[nbr];
                    dist1[nbr] = dist;
                    pq.add(new int[]{nbr,dist});
                }else if(dist>dist1[nbr] && dist<dist2[nbr]){
                    dist2[nbr] = dist;
                    pq.add(new int[]{nbr,dist});
                }
            }
        }
        return -1;
    }
}
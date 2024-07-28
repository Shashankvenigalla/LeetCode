class Solution {
    void floydwarshal(int [][]dist,char[] original, char[] changed, int[] cost)
    {
        for(int i=0;i<original.length;i++)
        {
            int s=original[i]-'a';
            int t=changed[i]-'a';
            dist[s][t]=Math.min(dist[s][t],cost[i]);
        }

        //APPLY FLOYD WARSHAL
        for(int k=0;k<26;++k)
        {
            for(int i=0;i<26;++i)
            {
                for(int j=0;j<26;++j)
                {
                    // dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                    if (dist[i][k] < Integer.MAX_VALUE && dist[k][j] < Integer.MAX_VALUE) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }
    }

    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int [][]dist=new int[26][26];
        // for(int i=0;i<26;i++)
        // {
        //     for(int j=0;j<26;j++)
        //     {
        //         dist[i][j]=Integer.MAX_VALUE;
        //     }
        // }
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        floydwarshal(dist,original,changed,cost);//Update itself shortest_path
        long ans=0;
        for(int i=0;i<source.length();i++)
        {
            if(source.charAt(i)==target.charAt(i))
            {
                continue;
            }
            int u = source.charAt(i) - 'a';
            int v = target.charAt(i) - 'a';
            if(dist[u][v]==Integer.MAX_VALUE)
            {
                return -1;
            }
            else
            {
                ans+=dist[u][v];
            }
        }
        return ans;
    }
}
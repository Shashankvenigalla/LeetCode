class Solution {
    public int solve(int a[])
    {
        Stack<Integer> st1=new Stack<>();
        int nse[]=new int[a.length];
        for(int i=a.length-1;i>=0;i--)
        {
            while(!st1.isEmpty() && a[st1.peek()]>=a[i])
            st1.pop();
            if(st1.isEmpty())
            nse[i]=a.length;
            else
            nse[i]=st1.peek();
            st1.push(i);
        }
        Stack<Integer> st2=new Stack<>();
        int pse[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            while(!st2.isEmpty() && a[st2.peek()]>=a[i])
            st2.pop();
            if(st2.isEmpty())
            pse[i]=-1;
            else
            pse[i]=st2.peek();
            st2.push(i);
        }
        int ans=0;
        for(int i=0;i<a.length;i++)
        {
           ans=Math.max(ans,(a[i]*(nse[i]-pse[i]-1)));
        }
        return ans;
    }
    public int maximalRectangle(char[][] matrix) {
        int mat[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix[0].length;i++)
        {
            int c=0;
            for(int j=0;j<matrix.length;j++)
            {
                if(matrix[j][i]=='0')
                c=0;
                else
                c+=1;
                mat[j][i]=c;
            }
        }
       /* for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }*/
        int ans=0;
        for(int i=0;i<matrix.length;i++)
        {
            ans=Math.max(ans,solve(mat[i]));
        }
        return ans;
    }
}
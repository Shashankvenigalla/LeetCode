class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int topEnd,bottomEnd,leftEnd,rightEnd;
        int noRow=mat.length,noCol=mat[0].length;
        int i=0,j=0;
        List<Integer> res = new ArrayList<>();
        topEnd=-1;
        bottomEnd=noRow;
        leftEnd=-1;
        rightEnd=noCol;
        while(res.size()!=(noRow*noCol) ){
            while(leftEnd<=rightEnd && j < rightEnd && res.size()!=(noRow*noCol)){
                res.add(mat[i][j]);
                j++;
            }
            j--;
            i++;
            topEnd++;

            while(topEnd<=bottomEnd && i < bottomEnd && res.size()!=(noRow*noCol)){
                res.add(mat[i][j]);
                i++;
            }
            i--;
            j--;
            rightEnd--;

            while(leftEnd<=rightEnd && j > leftEnd && res.size()!=(noRow*noCol)){
                res.add(mat[i][j]);
                j--;
            }
            j++;
            i--;
            bottomEnd--;

            while(topEnd<=bottomEnd && i>topEnd && res.size()!=(noRow*noCol)){
                res.add(mat[i][j]); 
                i--;
            }
            i++;
            j++;
            leftEnd++;
        }
        return res;
    }
}
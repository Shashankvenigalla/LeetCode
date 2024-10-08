class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                int col = 0;
                int row = 0;
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                while(col < m){
                    max = Math.max(max, matrix[col][j]);
                    col++;
                }
                while(row < n){
                    min = Math.min(min, matrix[i][row]);
                    row++;
                }
                if(min == matrix[i][j] && max == matrix[i][j]){
                    result.add(matrix[i][j]);
                }
            }
        }
        return result;
    }
}
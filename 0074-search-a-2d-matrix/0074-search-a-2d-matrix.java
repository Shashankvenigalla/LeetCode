class Solution {
    public boolean searchMatrix(int[][] a, int t) {
        int m = a.length;
        int n = a[0].length;
        int left = 0;
        int right = m * n - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            int r = mid / n;  
            int c = mid % n;  
            int temp = a[r][c]; 
            
            if (t == temp) {
                return true; 
            } else if (t > temp) {
                left = mid + 1;
            } else {
                right = mid - 1; 
            }
        }
        
        return false;
}
}
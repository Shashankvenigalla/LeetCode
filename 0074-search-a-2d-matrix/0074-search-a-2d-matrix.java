class Solution {
    public boolean searchMatrix(int[][] a, int t) {
        int m = a.length;
        int n = a[0].length;
        int left = 0;
        int right = m * n - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            int r = mid / n;  // Calculate row index
            int c = mid % n;  // Calculate column index
            int temp = a[r][c]; // Access the matrix element
            
            if (t == temp) {
                return true; // Target found
            } else if (t > temp) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        
        return false; // Target not found
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        
        int target1 = 3;
        int target2 = 13;

        // Test Case 1
        boolean result1 = solution.searchMatrix(matrix, target1);
        System.out.println("Target " + target1 + " found: " + result1); // Expected output: true

        // Test Case 2
        boolean result2 = solution.searchMatrix(matrix, target2);
        System.out.println("Target " + target2 + " found: " + result2); // Expected output: false
}
}

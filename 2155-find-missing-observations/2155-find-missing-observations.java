class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int[] ans = new int[n];
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum = sum + rolls[i];
        }
        int remainSum = (m + n) * mean - sum;
        if (remainSum > 6 * n || remainSum < n) {
            return new int[0];
        }
        while (n >= 1) {
            if (remainSum - 6 >= n - 1) {
                n = n - 1;
                ans[n] = 6;
                remainSum-=6;
            } else if (remainSum - 5 >= n - 1) {
                n = n - 1;
                ans[n] = 5;
                remainSum-=5;
            } else if (remainSum - 4 >= n - 1) {
                n = n - 1;
                ans[n] = 4;
                remainSum-=4;
            } else if (remainSum - 3 >= n - 1) {
                n = n - 1;
                ans[n] = 3;
                remainSum-=3;
            } else if (remainSum - 2 >= n - 1) {
                n = n - 1;
                ans[n] = 2;
                remainSum-=2;
            } else {
                n = n - 1;
                ans[n] = 1;
                remainSum-=1;
            }
        }
        return ans;
    }
}
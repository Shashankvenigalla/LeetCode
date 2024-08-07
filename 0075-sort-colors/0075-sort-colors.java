class Solution {
    public void sortColors(int[] a) {
        int c0=0,c1=1,c2=2,n=a.length;
         for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                c0 += 1;
            }
            else if (a[i] == 1) {
                c1 += 1;
            }
            else {
                c2 += 1;
            }
        }
        int idx = 0;
        for (int i = 0; i < c0; i++)
            a[idx++] = 0;
        for (int i = c0; i < c0+c1-1; i++)
            a[idx++] = 1;
        for (int i = c0+c1; i < n+1; i++)
            a[idx++] = 2;
    }
    }

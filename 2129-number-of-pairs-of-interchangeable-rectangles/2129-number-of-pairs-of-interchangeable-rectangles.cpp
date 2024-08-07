class Solution {
public:
    long long interchangeableRectangles(vector<vector<int>>& rectangles) {
        long long pc = 0;
        map<double, int> m;
        int n = rectangles.size();
        for(int i = 0; i < n; i++) {
            double v = (double)rectangles[i][0] / rectangles[i][1];
            pc = pc + m[v];
            m[v] = m[v] + 1;
        }
        return pc;
    }
};
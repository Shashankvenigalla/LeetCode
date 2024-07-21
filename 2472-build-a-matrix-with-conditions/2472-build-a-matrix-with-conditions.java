import java.util.*;

public class Solution {
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        List<Integer> rowOrder = topologicalSort(k, rowConditions);
        List<Integer> colOrder = topologicalSort(k, colConditions);

        if (rowOrder.isEmpty() || colOrder.isEmpty()) {
            return new int[0][0]; // Return an empty matrix if no valid ordering exists
        }

        int[][] matrix = new int[k][k];
        Map<Integer, Integer> rowPosition = new HashMap<>();
        Map<Integer, Integer> colPosition = new HashMap<>();

        for (int i = 0; i < k; i++) {
            rowPosition.put(rowOrder.get(i), i);
            colPosition.put(colOrder.get(i), i);
        }

        for (int num = 1; num <= k; num++) {
            int r = rowPosition.get(num);
            int c = colPosition.get(num);
            matrix[r][c] = num;
        }

        return matrix;
    }

    private List<Integer> topologicalSort(int n, int[][] conditions) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int[] inDegree = new int[n + 1];
        List<Integer> topoOrder = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int[] condition : conditions) {
            int u = condition[0];
            int v = condition[1];
            graph.get(u).add(v);
            inDegree[v]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            int node = queue.poll();
            topoOrder.add(node);
            for (int neighbor : graph.get(node)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        if (topoOrder.size() == n) {
            return topoOrder;
        } else {
            return new ArrayList<>(); // Return an empty list if a cycle is detected
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int k = 3;
        int[][] rowConditions = {{1, 2}, {2, 3}};
        int[][] colConditions = {{2, 3}, {1, 2}};
        int[][] result = solution.buildMatrix(k, rowConditions, colConditions);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
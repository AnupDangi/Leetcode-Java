class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> result = new ArrayList<>();
        int skip = 0; // Global skip counter
        
        for (int i = 0; i < grid.length; i++) {
            int n = grid[i].length;
            if (i % 2 == 0) {
                // Traverse left-to-right
                for (int j = 0; j < n; j++) {
                    if (skip % 2 == 0) {
                        result.add(grid[i][j]);
                    }
                    skip++;
                }
            } else {
                // Traverse right-to-left
                for (int j = n - 1; j >= 0; j--) {
                    if (skip % 2 == 0) {
                        result.add(grid[i][j]);
                    }
                    skip++;
                }
            }
        }
        
        return result;
    }
}
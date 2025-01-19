class Solution {
    public int trapRainWater(int[][] heightMap) {
        // Get the dimensions of the height map
        int m = heightMap.length;
        int n = heightMap[0].length;

        // Create a visited array to keep track of cells that have been processed
        boolean[][] visited = new boolean[m][n];

        // Create a priority queue (min-heap) to store cells in ascending order of height
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        // Add all boundary cells to the priority queue and mark them as visited
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
                    // Add the cell as {height, row, column}
                    pq.add(new int[]{heightMap[i][j], i, j});
                    visited[i][j] = true;
                }
            }
        }

        // Define directions for the 4 possible moves (up, down, left, right)
        int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int waterVolume = 0; // Initialize the total water volume to 0

        // Perform BFS traversal using the priority queue
        while (!pq.isEmpty()) {
            // Remove the cell with the smallest height from the priority queue
            int[] arr = pq.poll();
            int currVal = arr[0]; // Current cell's height
            int currRow = arr[1]; // Current cell's row
            int currCol = arr[2]; // Current cell's column

            // Check all 4 neighbors of the current cell
            for (int[] dir : direction) {
                int newRow = currRow + dir[0]; // Calculate new row
                int newCol = currCol + dir[1]; // Calculate new column

                // Check if the new cell is within bounds and has not been visited
                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && !visited[newRow][newCol]) {
                    
                    // If the current cell's height is greater than the neighbor's height,
                    // calculate the water trapped and add the current height to the queue
                    if (currVal - heightMap[newRow][newCol] > 0) {
                        waterVolume += currVal - heightMap[newRow][newCol];
                        pq.add(new int[]{currVal, newRow, newCol});
                    } else {
                        // Otherwise, add the neighbor's height to the queue
                        pq.add(new int[]{heightMap[newRow][newCol], newRow, newCol});
                    }
                    
                    // Mark the neighbor as visited
                    visited[newRow][newCol] = true;
                }
            }
        }

        // Return the total volume of water trapped
        return waterVolume;
    }
}

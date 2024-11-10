import java.util.ArrayList;

class Solution {
    // Helper function for Depth First Search (DFS) to detect a cycle
    public boolean dfs(int src, ArrayList<Integer> adj[], int vis[]) {
        // If the current node is already visited in the current path, a cycle is found
        if (vis[src] == 0) {
            return true;
        }
        // If the node is fully processed, no need to visit again; no cycle here
        if (vis[src] == 1) {
            return false;
        }

        // Mark the current node as being processed (part of current DFS path)
        vis[src] = 0;

        // Explore all adjacent nodes
        for (int i = 0; i < adj[src].size(); i++) {
            int neighbor = adj[src].get(i);
            // If a cycle is detected in the recursion, return true
            if (dfs(neighbor, adj, vis)) {
                return true;
            }
        }

        // Mark the current node as fully processed
        vis[src] = 1;
        return false; // No cycle found in this path
    }

    // Main function to determine if all courses can be finished
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Create an adjacency list to represent the graph
        ArrayList<Integer>[] adj = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<>();
        }

        // Build the graph based on prerequisites
        for (int[] edge : prerequisites) {
            int dest = edge[0];  // Course that depends on the prerequisite
            int src = edge[1];   // Prerequisite course
            adj[src].add(dest);  // Add an edge from prerequisite to the course
        }

        // Initialize a visitation array to keep track of each node's state:
        // -1: Unvisited, 0: Visiting, 1: Fully processed
        int[] vis = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            vis[i] = -1; // All nodes start as unvisited
        }

        // Check each course; if it's unvisited, perform DFS to detect cycles
        for (int i = 0; i < numCourses; i++) {
            if (vis[i] == -1) {
                if (dfs(i, adj, vis)) { // If a cycle is detected
                    return false; // A cycle in the graph means we can't complete all courses
                }
            }
        }

        // If no cycles are detected, it is possible to finish all courses
        return true;
    }
}

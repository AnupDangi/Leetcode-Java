class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //create a helper function 
        boolean visited[][]=new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,visited,image[sr][sc]);//orgcolor image[sr][sc]
        return image;
    }
    public void helper(int [][]image,int sr,int sc,int color,boolean visited[][],int orgCol){
        //base case
        if(sr<0||sc<0||sr>=image.length||sc>=image[0].length||visited[sr][sc]||image[sr][sc]!=orgCol){
            return;
        }
        image[sr][sc]=color;
        //mark visited
        visited[sr][sc] = true;
        //move left ,right,up and down recursively
        helper(image,sr,sc-1,color,visited,orgCol);
        helper(image,sr,sc+1,color,visited,orgCol);
        helper(image,sr-1,sc,color,visited,orgCol);
        helper(image,sr+1,sc,color,visited,orgCol);
    }

}
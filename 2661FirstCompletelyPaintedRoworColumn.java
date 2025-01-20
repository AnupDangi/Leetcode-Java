class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) { //TC O(mn)
        int n=mat.length;
        int rowcnt[]=new int[mat.length];
        int colcnt[]=new int[mat[0].length];

        //create hashmap to store and retrieve at 0(1)
        HashMap<Integer,int[]>lookup=new HashMap<>();

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                lookup.put(mat[i][j],new int[]{i,j}); //stores value and i and j
            }
        }

        //iterate through the arr and lookup in table and update rowcnt and colcnt until any of them reaches 
        //mat.length or mat[0].length;

        for(int i=0;i<arr.length;i++){
            //lookup for table
            if(lookup.containsKey(arr[i])){
                int []indices=lookup.get(arr[i]);
                int row=indices[0];
                int col=indices[1];
                //update the rowcount and colcnt
                rowcnt[row]++;
                colcnt[col]++;

                  if(rowcnt[row]==mat[0].length || colcnt[col]==mat.length){
                    return i;
                  }
            }
        }
        return -1;
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res=new LinkedList<>();
        //Creating a HashMap to store subtrees and track the new repeted one using        Integer  value
        HashMap<String,Integer>map=new HashMap<>();
        preOrder(root,map,res);
        return res;
    }
    public String preOrder(TreeNode root,Map<String,Integer> map,List<TreeNode>res){
        //eg creating a string like root,left,right if null is there at left or right then return N
        if(root==null){
            return "N";
        }
            String str=root.val +",";
            str+=preOrder(root.left,map,res)+",";
            str+=preOrder(root.right,map,res)+",";

            //Add into map
            map.put(str,map.getOrDefault(str,0)+1);
            //if any string is repeated in map then add into result
            if(map.get(str)==2){
                res.add(root);
            }
                return str;
    }
}

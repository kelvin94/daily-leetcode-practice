package unpackagedquestion;
import java.util.*;



public class isUnivalTree {
    public boolean isUnivalTree(TreeNode root) {
        return dfs(root, root.val);
    }
    private boolean dfs(TreeNode n, int v) {
        if (n == null) { return true; }
        if (n.val != v) { return false; }
        return dfs(n.left, v) && dfs(n.right, v);
    }
    // #################LeetCode给的标准答案
//    public boolean isUnivalTree(TreeNode root) {
//        vals = new ArrayList();
//        dfs(root);
//        for (int v: vals)
//            if (v != vals.get(0))
//                return false;
//        return true;
//    }
//
//    public void dfs(TreeNode node) {
//        if (node != null) {
//            vals.add(node.val);
//            dfs(node.left);
//            dfs(node.right);
//        }
//    }
}

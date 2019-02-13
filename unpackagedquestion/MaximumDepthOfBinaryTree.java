package unpackagedquestion;
import java.util.*;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        int counter = dfs(root, 0);
        return counter;
    }
    public int dfs(TreeNode node, int counter) {
        if(node == null) { return counter; }
        else {
            counter+=1;
            int counter1 = dfs(node.left, counter);
            int counter2 = dfs(node.right, counter);
            if(counter1 > counter2){ return counter1; }
            else {return counter2;}
        }
    }
    //############# LeetCode答案
    // public int maxDepth(TreeNode root) {
    //     if (root == null) {
    //         return 0;
    //     }

    //     return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    // }

}

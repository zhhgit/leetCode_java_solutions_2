package session3.q094_binary_tree_inorder_traversal;

import session3.common.TreeBuilder;
import session3.common.TreeNode;
import java.util.LinkedList;
import java.util.List;

public class Solution1 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8};
        TreeBuilder treeBuilder = new TreeBuilder(nums);
        System.out.println(inorderTraversal(treeBuilder.getRoot()));
    }

    private static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if(root == null){
            return list;
        }
        visit(list,root);
        return list;
    }

    private static void visit(List<Integer> list,TreeNode root){
        if(root != null){
            visit(list,root.left);
            list.add(root.val);
            visit(list,root.right);
        }
    }
}

//package com.uin.tree.foreach;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//
////dfs-深度优先遍历-前序遍历
//public class PrForEach {
//    public static void Main(String[] args) {
//        TreeNode root = new TreeNode();
//
//    }
//
//    public static List<Integer> solution(TreeNode root) {
//        List<Integer> res = new ArrayList<Integer>();
//        if (root == null) {
//            return res;
//        }
//        Stack<TreeNode> stack = new Stack<TreeNode>();
//        stack.push(root);
//        while (!stack.isEmpty()) {
//            TreeNode node = stack.pop();
//            res.add(Integer.valueOf(node.val));
//            if (node.right != null) {
//                stack.push(node.right);
//            }
//            if (node.left != null) {
//                stack.push(node.left);
//            }
//        }
//        return res;
//    }
//}

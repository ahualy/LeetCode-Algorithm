package ahualy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BinaryTreeLevelOrderTraversal102 {

    public static void main(String[] args) {


        TreeNode root = new TreeNode(3);

        List<List<Integer>> res = levelOrder(root);
        System.out.println(res);
    }


    public static  List<List<Integer>> levelOrder(TreeNode root) {


        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> currLevel = new ArrayList<>();

            for (int i = 0; i <levelSize ; i++) {
                TreeNode currNode = q.poll();
                currLevel.add(currNode.val);
                if (currNode.left != null)
                    q.add(currNode.left);
                if (currNode.right != null)
                    q.add(currNode.right);
            }
            result.add(currLevel);
        }

        return result;
    }
}

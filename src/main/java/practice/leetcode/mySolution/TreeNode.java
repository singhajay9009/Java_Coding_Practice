package practice.leetcode.mySolution;


public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode();
        node.val = 5;

        node.left= new TreeNode(4);

        node.left.left= new TreeNode(11);
        node.left.left.left= new TreeNode(7);
        node.left.left.right= new TreeNode(2);

        node.right = new TreeNode(8);
        node.right.left= new TreeNode(13);
        node.right.right= new TreeNode(4);
        node.right.right= new TreeNode(1);


        System.out.println(new NodeSum().hasPathSum(node, 22));
    }

}

class NodeSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {

       int sum = nodeSum(root);

       return (targetSum == sum);

    }


    public int nodeSum(TreeNode node){
        if(node == null) return 0;
        else return (node.val + nodeSum(node.left) + nodeSum(node.right));
    }
}


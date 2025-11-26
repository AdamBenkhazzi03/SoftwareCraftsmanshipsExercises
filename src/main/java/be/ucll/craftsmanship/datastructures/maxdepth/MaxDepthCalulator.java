package be.ucll.craftsmanship.datastructures.maxdepth;

public class MaxDepthCalulator {
    public int maxDepthUsingRecursion(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int depthR = maxDepthUsingRecursion(root.right);
        int depthL = maxDepthUsingRecursion(root.left);

        return Math.max(depthL, depthR)+1;
    }

    public int maxDepthUsingBFS(TreeNode root) {
        if (root == null) return 0;
        return 1;
    }
}

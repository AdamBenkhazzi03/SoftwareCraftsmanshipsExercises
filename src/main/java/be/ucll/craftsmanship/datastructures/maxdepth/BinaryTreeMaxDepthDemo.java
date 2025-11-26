package be.ucll.craftsmanship.datastructures.maxdepth;

public class BinaryTreeMaxDepthDemo {
    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));
        root.getLeft().setLeft(new TreeNode(4));
        root.getLeft().setRight(new TreeNode(5));
        // Representation of the input tree:
        //     1
        //    /  \
        //   2   3
        //  / \
        // 4   5

        MaxDepthCalulator calculator = new MaxDepthCalulator();
        int maxDepth = calculator.maxDepthUsingRecursion(root);
        System.out.println("Maximum depth of the binary tree: " + maxDepth);

        int maxDepthBFS = calculator.maxDepthUsingBFS(root);
        System.out.println("Maximum depth of the binary tree using BFS: " + maxDepthBFS);


    }
}

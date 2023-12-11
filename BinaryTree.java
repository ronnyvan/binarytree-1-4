import java.util.*;

public class BinaryTree {
    private TreeNode root;

    /**
     * constructs a binary tree build level-by-level from values found
     * in items; constructs an empty tree if items.length == 0
     */
    public BinaryTree(int[] items) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        for (int i = 0; i < items.length; i++) {
            TreeNode t = new TreeNode(items[i]);
            if (q.isEmpty())
                root = t;
            else {
                TreeNode q1 = q.peek();
                if (q1.getLeft() == null && q1.getRight() == null) {
                    q1.setLeft(t);
                } else if (q1.getLeft() != null && q1.getRight() == null) {
                    q1.setRight(t);
                    q.poll();
                }
            }
            q.offer(t);
        }
    }

    /**
     * returns true if this BinaryTree is a min-heap; otherwise
     * returns false
     */
    public boolean isMinHeap() {

        return root == null || isMinHeap(root);
    }

    private boolean isMinHeap(TreeNode t) {
        if (t == null)
            return true;
        if()
    }

    /**
     * returns true if this BinaryTree is a max-heap; otherwise
     * returns false
     */
    public boolean isMaxHeap() {

    }

    private boolean isMaxHeap(TreeNode t) {
    }

    /**
     * outputs the data of this BinaryTree in level order.
     * 
     */
    public void levelOrder() {
        String s = "";
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while (!q.isEmpty()) {
            if (q.peek().getLeft() != null)
                q.offer(q.peek().getLeft());
            if (q.peek().getRight() != null)
                q.offer(q.peek().getRight());
            s += q.poll().getValue() + ", ";
        }
        System.out.println(s.substring(0, s.length() - 2));
    }

    private void levelOrder(TreeNode t) {
        // to be completed in lab
    }

    /**
     * returns the minimum Integer in the tree.
     * 
     */
    public Integer minValue() {

    }

    private Integer minValue(TreeNode t) {

    }

    /**
     * returns the maximum Integer in the tree.
     * 
     */
    public Integer maxValue() {

    }

    private Integer maxValue(TreeNode t) {
        // to be completed in lab

    }

}
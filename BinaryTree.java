import java.util.*;

public class BinaryTree
{
    private TreeNode root;

    /**
     * constructs a binary tree build level-by-level from values found
     * in items; constructs an empty tree if items.length == 0
     */
    public BinaryTree(int[] items)
    {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        for(int i = 0; i < items.length; i++)
        {
            TreeNode t = new TreeNode(items[i]);
            if(q.isEmpty())
                root = t;
            else
            {
                TreeNode q1 = q.peek();
                if(q1.getLeft() == null && q1.getRight() == null)
                {
                    q1.setLeft(t);
                } 
                else if(q1.getLeft() != null && q1.getRight() == null)
                {
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
    public boolean isMinHeap()
    {
        return root == null || isMinHeap(root);
    }
   
    private boolean isMinHeap(TreeNode t)
    {
        if(t == null){
            return true;
        }
        //to be completed in lab
        if(t.getLeft() != null && t.getLeft().getValue() < t.getValue() 
        || t.getRight() != null && t.getRight().getValue() < t.getValue()){
            return false;
        }
        return isMinHeap(t.getLeft()) && isMinHeap(t.getRight());
    }
    

    /**
     * returns true if this BinaryTree is a max-heap; otherwise
     * returns false
     */
    public boolean isMaxHeap()
    {
        return root == null || isMaxHeap(root);
    }

    private boolean isMaxHeap(TreeNode t)
    {
        //to be completed in lab
         if(t == null){
            return true;
        }
        //to be completed in lab
        if(t.getLeft() != null && t.getLeft().getValue() > t.getValue() 
        || t.getRight() != null && t.getRight().getValue() > t.getValue()){
            return false;
        }
        return isMaxHeap(t.getLeft()) && isMaxHeap(t.getRight());
    }

    /**
     * outputs the data of this BinaryTree in level order.
     * 
     */
    public void levelOrder()
    {
        String s = "";
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty())
        {
            if(q.peek().getLeft() != null)
                q.offer(q.peek().getLeft());
            if(q.peek().getRight() != null)
                q.offer(q.peek().getRight());
            s += q.poll().getValue() + ", ";
        }
        System.out.println(s.substring(0, s.length() - 2));
    }

    private void levelOrder(TreeNode t)
    {
        //to be completed in lab
    }

    /**
     * returns the minimum Integer in the tree.
     * 
     */
    public Integer minValue()
    {
        if(root == null)
            return Integer.MAX_VALUE;
        if(this.isMinHeap())
            return root.getValue();
        return minValue(root);
        
    }

    private Integer minValue(TreeNode t)
    {
        if(t == null)
            return Integer.MAX_VALUE;
        int minLeftRight = Math.min(minValue(t.getLeft()), minValue(t.getRight()));
        return Math.min(t.getValue(), minLeftRight);
    }

    /**
     * returns the maximum Integer in the tree.
     * 
     */
    public Integer maxValue()
    {
        if(root == null)
            return Integer.MIN_VALUE;
        if(isMaxHeap())
            return root.getValue();
        return maxValue(root);
    }

    private Integer maxValue(TreeNode t)
    {
        //to be completed in lab
        if(t == null)
            return Integer.MIN_VALUE;
        int maxLeftRight = Math.max(maxValue(t.getLeft()), maxValue(t.getRight()));
        return Math.max(t.getValue(), maxLeftRight);
    }
    
}

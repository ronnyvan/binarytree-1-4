/**
 * TreeNode.java  
 *
 * @author - Jane Doe
 * @author - Period n
 * 
 */ 
public class TreeNode
{
    private Integer value;
    private TreeNode leftChild;
    private TreeNode rightChild;
    
    public TreeNode(Integer value)
    {
        this.value = value;
        leftChild = null;
        rightChild = null;
    }
    
    public Integer getValue()
    {
        return value;
    }

    public TreeNode getLeft()
    {
        return leftChild;
    }

    public TreeNode getRight()
    {
        return rightChild;
    }

    public void setLeft(TreeNode leftChild)
    {
        this.leftChild = leftChild;
    }

    public void setRight(TreeNode rightChild)
    {
        this.rightChild = rightChild;
    }

    
}
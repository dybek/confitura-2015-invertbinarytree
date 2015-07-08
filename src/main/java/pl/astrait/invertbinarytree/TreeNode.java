package pl.astrait.invertbinarytree;

public class TreeNode {
	int val;
	
    TreeNode left;
    TreeNode right;
    
    TreeNode(int x) {val = x; }
    
    void invert(){
    	TreeNode temporary = left;
    	left = right;
    	right = temporary;
    	if(left != null) left.invert();
    	if(right != null) right.invert();
    }
}

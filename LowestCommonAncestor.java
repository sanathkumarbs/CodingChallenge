import javax.swing.tree.TreeNode;

/*
 * 
Given a binary tree and 2 tree nodes A and B(assuming both nodes A and B are present in the tree), 
find the lowest common ancestor of the nodes.




 */

public class LowestCommonAncestor {
	
	public static void main(String[] args) {
	        LowestCommonAncestor tree = new LowestCommonAncestor();
	        tree.createSampleTree();
	        TreeNode A = tree.getRoot().getLeft().getLeft();    
	        TreeNode B = tree.getRoot().getRight();             
	        TreeNode lca = tree.getLowestCommonAncestor(A, B);
	        System.out.println("LCA of "  + A.getData() + " and "  + B.getData() + " is "  + lca);
	    }
	
	

}

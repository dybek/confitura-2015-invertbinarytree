package pl.astrait.invertbinarytree;

import static org.junit.Assert.*;

import org.junit.Test;

public class TreeTest {

	@Test
	public void invertTest() {
		TreeNode[] treeNodes = new TreeNode[8];
		//shift index to more readable test
		treeNodes[0] = null;
		for(int i = 1; i<=7; i++){
			treeNodes[i] = new TreeNode(i);
		}
		treeNodes[1].left = treeNodes[2];
		treeNodes[1].right = treeNodes[3];
		treeNodes[2].left = treeNodes[4];
		treeNodes[2].right = treeNodes[5];
		treeNodes[3].left = treeNodes[6];
		treeNodes[3].right = treeNodes[7];
		
		TreeNode root = treeNodes[1];
		root.invert();
		
		assertEquals(root.left.val, 3);
		assertEquals(root.right.val, 2);
		assertEquals(root.left.left.val, 7);
		assertEquals(root.left.right.val, 6);
		assertEquals(root.right.left.val, 5);
		assertEquals(root.right.right.val, 4);
	}

}

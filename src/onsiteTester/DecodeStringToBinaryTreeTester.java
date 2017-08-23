package onsiteTester;

import org.junit.Test;

import onsite.DecodeStringToBinaryTree;
import onsite.DecodeStringToBinaryTree.TreeNode;

public class DecodeStringToBinaryTreeTester {

	@Test
	public void test() {
		DecodeStringToBinaryTree tester=new DecodeStringToBinaryTree();
		TreeNode root=tester.buildTree("5(4(3)(7))(16()(8))");
		tester.displayTree(root);
		root=tester.buildTree("5(4(3))(1()(2(3)(6)))");
		tester.displayTree(root);
	}

}

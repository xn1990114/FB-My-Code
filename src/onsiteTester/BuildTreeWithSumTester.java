package onsiteTester;

import static org.junit.Assert.*;

import org.junit.Test;

import onsite.BuildTreeWithSum;
import onsite.BuildTreeWithSum.TreeNode;

public class BuildTreeWithSumTester {
/*
 * 				10
 * 		5                 13
 * 4         8        11            18
 *         7   9        12      16       20
 *       6                   14
 *                             15
 */
	@Test
	public void test() {
		BuildTreeWithSum tester=new BuildTreeWithSum();
		TreeNode n10=tester.new TreeNode(10);TreeNode n5=tester.new TreeNode(5);
		TreeNode n6=tester.new TreeNode(6);TreeNode n4=tester.new TreeNode(4);
		TreeNode n7=tester.new TreeNode(7);TreeNode n12=tester.new TreeNode(12);
		TreeNode n8=tester.new TreeNode(8);TreeNode n14=tester.new TreeNode(14);
		TreeNode n9=tester.new TreeNode(9);TreeNode n15=tester.new TreeNode(15);
		TreeNode n11=tester.new TreeNode(11);TreeNode n16=tester.new TreeNode(16);
		TreeNode n13=tester.new TreeNode(13);TreeNode n18=tester.new TreeNode(18);
		TreeNode n20=tester.new TreeNode(20);
		n10.left=n5;n10.right=n13;n5.left=n4;n5.right=n8;n8.left=n7;n8.right=n9;
		n7.left=n6;n13.left=n11;n11.right=n12;n13.right=n18;n18.left=n16;n16.left=n14;
		n14.right=n15;n18.right=n20;
		TreeNode curr=tester.buildTreeWithSum(n10);
		tester.display(curr);
	}

}

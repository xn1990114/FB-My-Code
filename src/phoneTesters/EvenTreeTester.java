package phoneTesters;

import static org.junit.Assert.*;

import org.junit.Test;

import phone.EvenTree;
import phone.EvenTree.TreeNode;

public class EvenTreeTester {

	@Test
	public void test() {
		EvenTree et=new EvenTree();
		// tc 1 graph https://www.hackerrank.com/challenges/even-tree
		TreeNode n1=et.new TreeNode(1);TreeNode n2=et.new TreeNode(2);TreeNode n3=et.new TreeNode(3);
		TreeNode n4=et.new TreeNode(4);TreeNode n5=et.new TreeNode(5);TreeNode n6=et.new TreeNode(6);
		TreeNode n7=et.new TreeNode(7);TreeNode n8=et.new TreeNode(8);TreeNode n9=et.new TreeNode(9);
		TreeNode n10=et.new TreeNode(10);
		n1.child.add(n2);n1.child.add(n3);n1.child.add(n6);
		n3.child.add(n4);n6.child.add(n8);n8.child.add(n9);n8.child.add(n10);
		n2.child.add(n7);n2.child.add(n5);
		assertTrue(et.countEdge(n1)==2);
		// tc 2 graph http://rootchutney.blogspot.com/2014/10/even-tree.html
		n1=et.new TreeNode(1);n2=et.new TreeNode(2);n3=et.new TreeNode(3);
		n4=et.new TreeNode(4);n5=et.new TreeNode(5);n6=et.new TreeNode(6);
		n7=et.new TreeNode(7);n8=et.new TreeNode(8);n9=et.new TreeNode(9);
		n10=et.new TreeNode(10);
		n1.child.add(n2);n1.child.add(n3);n1.child.add(n4);n2.child.add(n5);n5.child.add(n8);
		n3.child.add(n6);n6.child.add(n9);n6.child.add(n10);n4.child.add(n7);
		assertTrue(et.countEdge(n1)==3);
	}

}

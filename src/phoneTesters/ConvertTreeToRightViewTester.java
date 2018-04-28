package phoneTesters;

import static org.junit.Assert.*;

import org.junit.Test;

import phone.ConvertTreeToRightView;
import phone.ConvertTreeToRightView.TreeNode;
/*
      A
    /   \
  B      C
/ \    /   \ 
D  E  F    G

      A
    /   \
  B      C
    \    /   \ 
     E  F    G
 */
public class ConvertTreeToRightViewTester {

	@Test
	public void test1() {
		ConvertTreeToRightView tester=new ConvertTreeToRightView();
		TreeNode a=tester.new TreeNode('A');TreeNode b=tester.new TreeNode('B');
		TreeNode c=tester.new TreeNode('C');TreeNode d=tester.new TreeNode('D');
		TreeNode e=tester.new TreeNode('E');TreeNode f=tester.new TreeNode('F');
		TreeNode g=tester.new TreeNode('G');
		a.left=b;a.right=c;b.left=d;b.right=e;c.left=f;c.right=g;
		tester.printTree(tester.convertToRightView(a));
		
	}
	@Test
	public void test2() {
		ConvertTreeToRightView tester=new ConvertTreeToRightView();
		TreeNode a=tester.new TreeNode('A');TreeNode b=tester.new TreeNode('B');
		TreeNode c=tester.new TreeNode('C');TreeNode d=tester.new TreeNode('D');
		TreeNode e=tester.new TreeNode('E');TreeNode f=tester.new TreeNode('F');
		TreeNode g=tester.new TreeNode('G');
		a.left=b;a.right=c;b.right=e;c.left=f;c.right=g;
		tester.printTree(tester.convertToRightView(a));
	}

}

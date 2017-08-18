package onsite;
import java.util.*;

public class BuildBSTFromPreorder {
	public class Node{
		Node left;
		Node right;
		int val;
		public Node(int val){
			this.val=val;
		}
	}
	
	public Node buildTree(int[] values){
		if(values.length==0){
			return null;
		}
		Node root=new Node(values[0]);
		Stack<Node> stack=new Stack<Node>();
		stack.push(root);
		for(int i=1;i<values.length;i++){
			Node curr=new Node(values[i]);
			if(curr.val<stack.peek().val){
				stack.peek().left=curr;
			}
			else{
				Node top=stack.pop();
				while(!stack.isEmpty()&&stack.peek().val<curr.val){
					top=stack.pop();
				}
				top.right=curr;
			}
			stack.push(curr);
		}
		return root;
	}
	
	public void displayTree(Node root,StringBuilder sb){ // preorder
		if(root==null){
			return;
		}
		sb.append(root.val+",");
		displayTree(root.left,sb);
		displayTree(root.right,sb);
	}
}

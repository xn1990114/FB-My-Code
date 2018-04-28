package phone;
import java.util.*;
/*
 * 给定一个tree
      A
    /   \
  B      C
/ \    /   \ 
D  E  F    G

将树变成：
        A
      /   
    B  — C
  /
D — E — F — G

树的right point to sibling. 

如果出现：
      A
    /   \
  B      C
    \    /   \ 
     E  F    G
那么对B来说，B.left = E B.right = C
 */
public class ConvertTreeToRightView {
	public class TreeNode{
		public TreeNode left;
		public TreeNode right;
		char val;
		public TreeNode(char val){
			this.val=val;
		}
	}
	public TreeNode convertToRightView(TreeNode root){
		if(root==null){
			return root;
		}
		Queue<TreeNode> qu=new LinkedList<TreeNode>();
		qu.offer(root);
		TreeNode lastRowFirst=null;
		while(!qu.isEmpty()){
			int size=qu.size();
			if(lastRowFirst!=null){
				lastRowFirst.left=qu.peek();
			}
			lastRowFirst=qu.peek();
			TreeNode currRowParent=null;
			for(int i=0;i<size;i++){
				TreeNode top=qu.poll();
				if(currRowParent!=null){
					currRowParent.right=top;
				}
				currRowParent=top;
				if(top.left!=null){
					qu.offer(top.left);
					top.left=null;
				}
				if(top.right!=null){
					qu.offer(top.right);
					top.right=null;
				}
			}
		}
		return root;
	}
	public void printTree(TreeNode root){
		if(root==null){
			System.out.println();
			return;
		}
		TreeNode curr=root;
		while(curr!=null){
			System.out.print(curr.val+"  ");
			curr=curr.right;
		}
		System.out.println();
		printTree(root.left);
	}
}

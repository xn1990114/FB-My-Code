package onsite;

import java.util.*;

public class BuildTreeWithSum {
	public class TreeNode{
		int val;
		int leftSum;
		public TreeNode left;
		public TreeNode right;
		public TreeNode(int val){
			this.val=val;
		}
	}
	public TreeNode buildTreeWithSum(TreeNode ori){
		TreeNode root=new TreeNode(ori.val);
		int l=calSum(root,ori,ori.left);
		int r=calSum(root,ori,ori.right);
		root.leftSum=l+root.val;
		return root;
	}
	public int calSum(TreeNode currP,TreeNode oriP,TreeNode oriCurr){
		if(oriCurr==null){
			return 0;
		}
		TreeNode curr=new TreeNode(oriCurr.val);
		if(oriP.left==oriCurr){
			currP.left=curr;
		}
		else{
			currP.right=curr;
		}
		int l=calSum(curr,oriCurr,oriCurr.left);
		int r=calSum(curr,oriCurr,oriCurr.right);
		curr.leftSum=curr.val+l;
		return l+r+curr.val;
	}
	public void display(TreeNode root){
		Queue<TreeNode> qu=new LinkedList<TreeNode>();
		qu.offer(root);
		while(!qu.isEmpty()){
			int size=qu.size();
			for(int i=0;i<size;i++){
				TreeNode curr=qu.poll();
				if(curr==null){
					System.out.print("null" + "\t");
				}
				else{
					System.out.print(curr.val+","+curr.leftSum+"\t");
					qu.offer(curr.left);
					qu.offer(curr.right);
				}
			}
			System.out.println();
		}
	}
}

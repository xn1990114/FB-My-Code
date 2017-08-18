package onsite;
/*
 * 二叉搜索树里找出现频率最高的结点list 用哈希表很容易解 
 * follow up是如何利用二叉搜索树的特性在空间复杂度1的情况下解 
 * 用中序遍历可以持续更新出现最多的结点list 实现空间复杂度1 
 */
public class MostFrequentElementInBST {
	public class Node{
		public int val;
		public Node left;
		public Node right;
		public Node(int val){
			this.val=val;
		}
	}
	public int[] findMostFrequentElement(Node root){
		int[] result=new int[2];
		Node curr=root;
		int last=root.val+1;
		int count=0;
		while(curr!=null){
			if(curr.left==null){
				if(last==curr.val){
					count++;
				}
				else{
					last=curr.val;
					count=1;
				}
				if(count>result[1]){
					result[0]=last;
					result[1]=count;
				}
				curr=curr.right;
			}
			else{
				Node temp=curr.left;
				while(temp.right!=null&&temp.right!=curr){
					temp=temp.right;
				}
				if(temp.right==null){
					temp.right=curr;
					curr=curr.left;
				}
				else{
					temp.right=null;
					if(last==curr.val){
						count++;
					}
					else{
						last=curr.val;
						count=1;
					}
					if(count>result[1]){
						result[0]=last;
						result[1]=count;
					}
					curr=curr.right;
				}
			}
		}
		return result;
	}
}

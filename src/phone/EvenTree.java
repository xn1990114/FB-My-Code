package phone;
import java.util.*;
/*
 * you are given a tree (a simple connected graph with no cycles). 
 * The tree has  N nodes numbered from 1 to N and is rooted at node 1.
Find the maximum number of edges you can remove from the tree to get a forest 
such that each connected component of the forest contains an even number of vertices.
 */
public class EvenTree {
	public class TreeNode{
		public int val;
		public Set<TreeNode> child;
		public TreeNode(int val){
			this.val=val;
			this.child=new HashSet<TreeNode>();
		}
	}
	public int countEdge(TreeNode root){
		int[] result=new int[1];
		countTotalInChild(root,result);
		return result[0];
	}
	public int countTotalInChild(TreeNode curr,int[] result){
		if(curr==null){
			return 0;
		}
		int countConnected=1;
		for(TreeNode c:curr.child){
			int childCount=countTotalInChild(c,result);
			if(childCount==0){
				continue;
			}
			else if(childCount%2==1){
				countConnected++;
			}
			else{
				result[0]++;
			}
		}
		return countConnected;
	}
}

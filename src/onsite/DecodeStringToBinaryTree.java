package onsite;
import java.util.*;
/*
 * 给一个string '5(4(3)(7))(16()(8))', 返回一个binary tree如下
         5
       /   \
     4     16
    / \      \
  3   7      8. 
 */
public class DecodeStringToBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val){
			this.val=val;
		}
	}
	public TreeNode buildTree2(String s){
		TreeNode root=null;
		int index=0;
		Set<TreeNode> hasLeftChild=new HashSet<TreeNode>();
		Stack<TreeNode> stack=new Stack<TreeNode>();
		while(index<s.length()){
			char ch=s.charAt(index);
			if(ch==')'){
				TreeNode curr=stack.pop();
				if(stack.isEmpty()){
					root=curr;
				}
				else{
					if(hasLeftChild.contains(stack.peek())){
						hasLeftChild.remove(stack.peek());
						stack.peek().right=curr;
					}
					else{
						hasLeftChild.add(stack.peek());
						stack.peek().left=curr;
					}
				}
				index++;
			}
			else if(Character.isDigit(ch)||ch=='('){
				if(ch=='('){
					index++;
				}
				int start=index;
				while(index<s.length()&&Character.isDigit(s.charAt(index))){
					index++;
				}
				TreeNode toadd=start==index?null:new TreeNode(Integer.parseInt(s.substring(start,index)));
				stack.push(toadd);
			}
		}
		return stack.isEmpty()?null:stack.pop();
	}
	
	
	
	
	
	
	public TreeNode buildTree(String s){
		if(s.length()==0){
			return null;
		}
		s="("+s+")";
		Stack<TreeNode> stack=new Stack<TreeNode>();
		Set<TreeNode> lefted=new HashSet<TreeNode>();
		TreeNode root=null;
		int index=0;
		while(index<s.length()){
			char ch=s.charAt(index);
			if(ch=='('){
				index++;
				int start=index;
				while(index<s.length()&&s.charAt(index)>='0'&&s.charAt(index)<='9'){
					index++;
				}
				TreeNode curr=start==index?null:new TreeNode(Integer.parseInt(s.substring(start,index)));
				stack.push(curr);
			}
			else{
				TreeNode curr=stack.pop();
				lefted.remove(curr);
				if(stack.isEmpty()){
					root=curr;
				}
				else{
					TreeNode last=stack.peek();
					if(lefted.contains(last)){
						last.right=curr;
						lefted.remove(last);
					}
					else{
						lefted.add(last);
						last.left=curr;
					}
				}
				index++;
			}
		}
		return root;
	}
	public void displayTree(TreeNode root){
		Queue<TreeNode> qu=new LinkedList<TreeNode>();
		qu.offer(root);
		boolean cont=true;
		while(cont){
			cont=false;
			int size=qu.size();
			for(int i=0;i<size;i++){
				TreeNode curr=qu.poll();
				if(curr==null){
					System.out.print("null"+"\t");
					qu.offer(null);
					qu.offer(null);
				}
				else{
					cont=true;
					System.out.print(curr.val+"\t");
					qu.offer(curr.left);
					qu.offer(curr.right);
				}
			}
			System.out.println();
		}
	}
}

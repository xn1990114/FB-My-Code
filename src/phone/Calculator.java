package phone;
import java.util.*;
/*
 * input string，加减乘除括号都有，output一个integer，之前没有做过这题，完全没有思路，直接挂。
 * 例如，Input是：13*(1256*31-(33/2))-5/8+9，然后output是计算出来的integer结果
 */
public class Calculator {
	public int calculateString(String s){
		Stack<Deque<Integer>> nums=new Stack<Deque<Integer>>();
		Stack<Deque<Character>> ops=new Stack<Deque<Character>>();
		Deque<Integer> num=new LinkedList<Integer>();
		Deque<Character> op=new LinkedList<Character>();
		int index=0;
		char sign='+';
		while(index<s.length()){
			char ch=s.charAt(index);
			if(Character.isDigit(ch)){
				int start=index;
				while(index<s.length()&&Character.isDigit(s.charAt(index))){
					index++;
				}
				int n=Integer.parseInt(s.substring(start,index));
				index--;
				num.offer(n);
				op.offer(sign);
			}
			else if(ch=='('){
				op.offerLast(sign);
				nums.push(num);
				ops.push(op);
				sign='+';
				num=new LinkedList<Integer>();
				op=new LinkedList<Character>();
			}
			else if(ch==')'){
				int temp=calQueue(num,op);
				num=nums.pop();
				op=ops.pop();
				num.offerLast(temp);
			}
			else{
				sign=ch;
			}
			index++;
		}
		return calQueue(num,op);
	}
	public int calQueue(Deque<Integer> num,Deque<Character> op){
		int curr=0;
		int last=0;
		while(!num.isEmpty()){
			int next=num.pollFirst();
			char sign=op.pollFirst();
			if(sign=='+'){
				curr=curr+next;
				last=next;
			}
			else if(sign=='-'){
				curr=curr-next;
				last=-next;
			}
			else if(sign=='*'){
				curr=curr-last+last*next;
				last=last*next;
			}
			else{
				curr=curr-last+last/next;
				last=last/next;
			}
		}
		return curr;
	}
}

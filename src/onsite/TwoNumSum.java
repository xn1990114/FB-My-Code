package onsite;
import java.util.*;
/*
 * 给两个数 n1, n2. n2 is n1 without 1 digit, 
 * e.g. n1 = 123, then n2 can be 12, 13 or 23. 现在知道n1+n2的和是多少， 求n1 和 n2 的可能值
 * http://www.1point3acres.com/bbs/thread-280686-1-1.html
 */
public class TwoNumSum {
	public List<int[]> findPairs(int sum){
		Set<Integer> visited=new HashSet<Integer>();
		List<int[]> result=new ArrayList<int[]>();
		String target=String.valueOf(sum);
		int div=11;
		int round=0;
		
		while(round<target.length()){
			int head=Integer.parseInt(target.substring(0, target.length()-round));
			int lead=head/div;
	
			String tail=target.substring(target.length()-round);
			if(!tail.equals("")&&Integer.parseInt(tail)%2==1){
				round++;
				continue;
			}
			String tail1=tail.equals("")?"":String.valueOf(Integer.parseInt(tail)/2);
			String tail2=(tail.equals(""))?"":String.valueOf(Integer.parseInt("1"+tail)/2);
			while(!tail1.equals("")&&tail1.length()<round){
				tail1="0"+tail1;
			}
			while(!tail2.equals("")&&tail2.length()<round){
				tail2="0"+tail2;
			}
			String low=lead+""+tail1;
			int low1=Integer.parseInt(low);
			// check diff as 10 for low1 and 0 for low2, very important
			if(!visited.contains(low1)&&head-lead*div<10){
				int[] toadd1={low1,sum-low1};
				result.add(toadd1);
				visited.add(low1);
			}
			
			low=lead+""+tail2;
			int low2=Integer.parseInt(low);
			if(!visited.contains(low2)&&lead!=0&&head-lead*div!=0){
				int[] toadd2={low2,sum-low2};
				result.add(toadd2);
				visited.add(low2);
			}
			round++;
		}
		return result;
	}
}

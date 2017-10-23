package onsite;
import java.util.*;
/*
 * 给一些sets，保证每个set内元素不重复，如果两个sets有任何共同元素，则让其合并，直到不能合并为止。输出最后的sets的状态。
 * 栗子，
 * Input: {1,2},{2,3},{3,4}{5,6,7},{7,8},{9},{9}
 * Output: {1,2,3,4},{5,6,7,8},{9}
 * 着重在分析时间复杂度
 */
public class MergeSet {
	public List<Set<Integer>> merge(List<Set<Integer>> sets){
		Map<Integer,Integer> parents=new HashMap<Integer,Integer>();
		for(int i=0;i<sets.size();i++){
			Set<Integer> curr=sets.get(i);
			int p=curr.iterator().next();
			if(!parents.containsKey(p)){
				parents.put(p,p);
			}	
			for(int num:curr){
				int[] p1=findParent(parents,p);
				if(!parents.containsKey(num)){
					parents.put(num, num);
				}
				int[] p2=findParent(parents,num);
				if(p1[1]>p2[1]){
					parents.put(p2[0], p1[0]);
				}
				else{
					parents.put(p1[0], p2[0]);
				}
			}
		}
		Map<Integer,Set<Integer>> tempRes=new HashMap<Integer,Set<Integer>>();
		for(int key:parents.keySet()){
			int[] p=findParent(parents,key);
			if(!tempRes.containsKey(p[0])){
				tempRes.put(p[0], new HashSet<Integer>());
			}
			tempRes.get(p[0]).add(key);
		}
		List<Set<Integer>> res=new ArrayList<Set<Integer>>();
		for(int key:tempRes.keySet()){
			res.add(tempRes.get(key));
		}
		return res;
	}
	public int[] findParent(Map<Integer,Integer> parents, int curr){
		int[] res={curr,0};
		while(res[0]!=parents.get(res[0])){
			res[0]=parents.get(res[0]);
			res[1]++;
		}
		return res;
	}
}

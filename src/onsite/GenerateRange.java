package onsite;
import java.util.*;
//給一個list = [1,2,4,5,6,8,9,13]，output a list of intervals = [(1,2), (4,6), (8,9), (13,13)]
public class GenerateRange {
	public List<int[]> makeRanges(int[] nums){
		List<int[]> res=new ArrayList<int[]>();
		Arrays.sort(nums);
		if(nums==null||nums.length==0){
			return res;
		}
		int start=nums[0];
		int expected=nums[0];
		for(int i=0;i<nums.length;i++){
			if(nums[i]>expected){
				res.add(new int[]{start,expected-1});
				start=nums[i];
				expected=start+1;
			}
			else{
				expected=nums[i]+1;
			}
		}
		res.add(new int[]{start,expected-1});
		return res;
	}
	public boolean checkRes(List<int[]> r1,int[][] r2){
		if(r1.size()!=r2.length){
			return false;
		}
		for(int i=0;i<r1.size();i++){
			int[] a1=r1.get(i);
			int[] a2=r2[i];
			if(a1[0]!=a2[0]||a1[1]!=a2[1]){
				return false;
			}
		}
		return true;
	}
}

package onsite;

import java.util.Arrays;
/*
 * 2sum + subsets结合的一题，给一个int array 没有重复 和一个target，
 * 要求数可以生成的subset数目满足条件 min(subset) + max(subset) < target
 * array contains only positive numbers
 */
public class CountTwoSumSubSet {
	
	public int count(int target,int[] array){
		Arrays.sort(array);
		int count=0;
		int start=0;
		int end=array.length-1;;
		while(start<=end){
			while(end>=start&&array[start]+array[end]>=target){
				end--;
			}
			if(end>=start){
				count=count+ (1<<(end-start));
			}
			start++;
		}
		return count;
	}
	
}

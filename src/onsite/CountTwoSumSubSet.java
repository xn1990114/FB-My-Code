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
		int maxIndex=findMax(array,target-array[0],0);
		if(maxIndex==-1){
			return 0;
		}
		for(int i=0;i<array.length&&i<maxIndex;i++){
			while(maxIndex>0&&array[i]+array[maxIndex]>=target){
				maxIndex--;
			}
			if(maxIndex<=i){
				return count;
			}
			count=count+(int)Math.pow(2, maxIndex-i-1);
		}
		return count;
	}
	// return index of max upper limit
	public int findMax(int[] array,int target,int start){
		start++;
		int end=array.length-1;
		while(start<=end){
			int mid=start+(end-start)/2;
			if(array[mid]<target&&(mid+1==array.length||array[mid+1]>=target)){
				return mid;
			}
			else if(array[mid]<target){
				start=mid+1;
			}
			else{
				end=mid-1;
			}
		}
		return -1;
	}
}

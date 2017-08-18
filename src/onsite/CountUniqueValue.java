package onsite;
/*
 * 给定一个数组, 已经sort好, 里面有大量重复的数, 输出每个数和这个数出现的次数. 
 * 先说扫一遍, 用hashmap计数, 问time complexity说是O(n), 不够好, 怎么快点儿, 答binary search.
 */
public class CountUniqueValue {
	public String countUnique(int[] nums){
		int index=0;
		StringBuilder sb=new StringBuilder();
		while(index<nums.length){
			int start=index;
			index=findEndIndex(nums,index,nums[index])+1;
			sb.append(nums[start]);
			sb.append('-');
			sb.append(index-start);
			sb.append(',');
		}
		if(sb.length()>0){
			sb.deleteCharAt(sb.length()-1);
		}
		return sb.toString();
	}
	public int findEndIndex(int[] nums,int start,int target){
		int s=start;
		int e=nums.length-1;
		while(s<=e){
			int mid=s+(e-s)/2;
			if(nums[mid]==target&&(mid==e||nums[mid+1]!=target)){
				return mid;
			}
			else if(nums[mid]==target){
				s=mid+1;
			}
			else{
				e=mid-1;
			}
		}
		return -1;
	}
}

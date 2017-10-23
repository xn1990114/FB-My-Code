package onsite;
/*
 * 第二题题目是现在要找三个这样的size of k的连续序列，序列不能有重叠，使得三个连续序列的总和要最大。
 */
/*
 * [1,2,3,4,5,7,8,9,10] 2
 */
public class FindThreeSubArrayOfSizeK {
	public int findMax(int[] nums,int k){
		if(nums.length<3*k||k==0){
			return 0;
		}
		int[] res=new int[nums.length];
		for(int round=1;round<=3;round++){
			int[] curr=new int[nums.length];
			int start=(round-1)*k;
			int total=0;
			int s=start;
			for(int i=start;i<nums.length;i++){
				total=total+nums[i];
				if(i-s+1==k){
					curr[i]=Math.max(i==start+k-1?Integer.MIN_VALUE:curr[i-1],total+(i-k<0?0:res[i-k]));
					total=total-nums[s];
					s++;
				}
			}
			res=curr;
		}
		return res[nums.length-1];
	}
}

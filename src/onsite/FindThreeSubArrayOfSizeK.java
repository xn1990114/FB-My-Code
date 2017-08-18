package onsite;
/*
 * 第二题题目是现在要找三个这样的size of k的连续序列，序列不能有重叠，使得三个连续序列的总和要最大。
 */
/*
 * [1,2,3,4,5,7,8,9,10] 2
 */
public class FindThreeSubArrayOfSizeK {
	public int findMax(int[] nums,int k){
		if(k*3>nums.length||k==0){
			return 0;
		}
		int[] counts=new int[nums.length];
		for(int c=1;c<=3;c++){
			int total=0;
			int[] newCount=new int[nums.length];
			int startPoint=c*k-1;
			for(int i=0;i<nums.length;i++){
				total=total+nums[i];
				if(i>=startPoint){
					int num1=i-1<startPoint?Integer.MIN_VALUE:newCount[i-1];
					int num2=i-k<0?0:counts[i-k];
					newCount[i]=Math.max(num1, num2+total);
				}
				if(i-k+1>=0){
					total=total-nums[i-k+1];
				}
			}
			counts=newCount;
		}
		return counts[counts.length-1];
	}
}

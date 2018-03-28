package phone;
/*
 * 给一个数组, 返回最大值的index.  如果有多个最大值, 随机(等概率)返回一个. 
 */
public class MaxElementPosition {
	public int findMaxPos(int[] nums){
		if(nums==null){
			return -1;
		}
		long max=Long.MIN_VALUE;
		int maxPos=-1;
		int countMaxTotal=0;
		for(int i=0;i<nums.length;i++){
			if(max<nums[i]){
				max=nums[i];
				countMaxTotal=1;
				maxPos=i;
			}
			else if(max==nums[i]){
				countMaxTotal++;
				int r=(int)(Math.random()*countMaxTotal);
				if(r==0){
					maxPos=i;
				}
			}
		}
		return maxPos;
	}
}

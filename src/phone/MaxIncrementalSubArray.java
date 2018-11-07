package phone;

import java.util.Arrays;

/*
 * 一个一维数组，输出连续增subarray的最长长度
fu1:允许跳过一个字母，输出连续增subarray最长长度
fu2:允许跳过k个字母，输出连续增subarray最长长
 */
// below code for follow up 2
public class MaxIncrementalSubArray {
	public int findMaxInscLength(int[] nums,int k) {
		if(nums==null||nums.length==0) {
			return 0;
		}
		int max=0;
		int[][] res=new int[nums.length][k+1];
		for(int i=0;i<nums.length;i++) {
			Arrays.fill(res[i], 1);
			for(int j=0;j<i;j++) {
				if(nums[j]<=nums[i]) {
					for(int skip=0;skip+i-j-1<=k;skip++) {
						res[i][skip+i-j-1]=Math.max(res[i][skip+i-j-1], 1+res[j][skip]);
					}
				}
			}
			for(int skip=0;skip<=k;skip++) {
				max=Math.max(max, res[i][skip]);
			}
		}
		return max;
	}
}

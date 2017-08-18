package phone;

import java.util.Arrays;

/*
 * 给出未排序的数组，rearrange 数组，
 * 使得奇数位置的num比偶数位置的num都要大比如，给出1,2,3,4,5, 期望结果1,4,2,5,3
 */
public class OddEvenRearrange {
	public void rearrange(int[] nums){
		int median=findKth(nums.length/2,nums,0,nums.length-1);
		int count=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]<median){
				count++;
			}
		}
		if(count<nums.length/2){
			Arrays.sort(nums);
			return;
		}
		int evenIndex=0;
		int oddIndex=nums.length-1;
		if(oddIndex%2==0){
			oddIndex--;
		}
		while(evenIndex<nums.length&&oddIndex>=0){
			while(evenIndex<nums.length&&nums[evenIndex]>=median){
				evenIndex=evenIndex+2;
			}
			while(oddIndex>=0&&nums[oddIndex]<median){
				oddIndex=oddIndex-2;
			}
			if(evenIndex<nums.length&&oddIndex>=0){
				int temp=nums[evenIndex];
				nums[evenIndex]=nums[oddIndex];
				nums[oddIndex]=temp;
				evenIndex=evenIndex+2;
				oddIndex=oddIndex-2;
			}
		}
	}
	public int findKth(int k,int[] nums,int s,int e){
		int curr=nums[s];
		int start=s;
		int end=e;
		s++;
		while(s<=e){
			while(s<=e&&nums[s]<=curr){
				s++;
			}
			while(e>=s&&nums[e]>curr){
				e--;
			}
			if(s<=e){
				int temp=nums[s];
				nums[s]=nums[e];
				nums[e]=temp;
				s++;
				e--;
			}
		}
		nums[start]=nums[e];
		nums[e]=curr;
		if(e==k){
			return curr;
		}
		else if(e>k){
			return findKth(k,nums,start,e-1);
		}
		else{
			return findKth(k,nums,e+1,end);
		}
	}
}

package phone;
//检查一个array，看能不能在one swap以内把它变成ascending order
public class AscendingInOneSwap {
	public boolean canSwapToAscend(int[] nums){
		int count=0;
		int i1=-1;
		int i2=-1;
		for(int i=0;i<nums.length-1;i++){
			if(nums[i]>nums[i+1]){
				if(count==2){
					return false;
				}
				if(i1==-1){
					i1=i;
				}
				i2=i+1;
				count++;
			}
		}
		if(i1==-1||i2==-1){
			return false;
		}
		int temp=nums[i1];
		nums[i1]=nums[i2];
		nums[i2]=temp;
		for(int i=1;i<nums.length;i++){
			if(nums[i]<nums[i-1]){
				return false;
			}
		}
		return true;
	}
}

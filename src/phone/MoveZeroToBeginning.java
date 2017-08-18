package phone;

public class MoveZeroToBeginning {
	public int moveZero(int[] array){
		int count=0;
		int i=0;
		int j=array.length-1;
		while(i<j){
			while(i<array.length&&array[i]==0){
				i++;
			}
			while(j>=0&&array[j]!=0){
				j--;
			}
			if(i<j){
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				i++;
				j--;
				count++;
			}
		}
		return count;
	}
	public void moveZero2(int[] array){
		int target=array.length-1;
		int index=array.length-1;
		while(target>=0){
			if(index>=0){
				if(array[index]==0){
					index--;
					continue;
				}
				else{
					array[target]=array[index];
					index--;
				}
			}
			else{
				array[target]=0;
			}
			target--;
		}
	}
}

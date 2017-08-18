package onsite;
/*
 * given a list, randomly return the index of the maximum value, 
 * there might be multiple maximum values in the list.
 */
public class RandomMaxNode {
	public int findRandomMax(int[] array){
		if(array==null||array.length==0){
			return -1;
		}
		int index=0;
		int count=1;
		int max=array[0];
		for(int i=1;i<array.length;i++){
			if(array[i]>max){
				max=array[i];
				index=i;
				count=1;
			}
			else if(array[i]==max){
				count++;
				int num=(int)(Math.random()*count);
				if(num==0){
					index=i;
				}
			}
		}
		return index;
	}
}

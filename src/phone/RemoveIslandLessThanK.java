package phone;

import java.util.HashSet;
import java.util.Set;
//given a plot of islands, remove all island that have less than K size
public class RemoveIslandLessThanK {
	public void removeIsLand(int[][] island,int k){
		Set<Integer> toUpdate=new HashSet<Integer>();
		int curr=2;
		for(int i=0;i<island.length;i++){
			for(int j=0;j<island[0].length;j++){
				if(island[i][j]==1){
					if(calArea(i,j,island,curr)>=k){
						toUpdate.add(curr);
					}
					curr++;
				}
			}
		}
		for(int i=0;i<island.length;i++){
			for(int j=0;j<island[0].length;j++){
				if(toUpdate.contains(island[i][j])){
					island[i][j]=1;
				}
				else{
					island[i][j]=0;
				}
			}
		}
		for(int i=0;i<island.length;i++){
			for(int j=0;j<island[0].length;j++){
				System.out.print(island[i][j]);
			}
			System.out.println();
		}
	}
	public int calArea(int i,int j,int[][] island,int curr){
		if(island[i][j]!=1){
			return 0;
		}
		island[i][j]=curr;
		int result=1;
		if(i-1>=0&&island[i-1][j]==1){
			result=result+calArea(i-1,j,island,curr);
		}
		if(i+1<island.length&&island[i+1][j]==1){
			result=result+calArea(i+1,j,island,curr);
		}
		if(j-1>=0&&island[i][j-1]==1){
			result=result+calArea(i,j-1,island,curr);
		}
		if(j+1<island[0].length&&island[i][j+1]==1){
			result=result+calArea(i,j+1,island,curr);
		}
		return result;
	}
}

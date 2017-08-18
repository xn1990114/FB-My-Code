package onsite;

import java.util.*;


/*
 * 数岛的follow up, 数unique island 比如

110000
110001
001101
101100
100000
总共有两个unique的岛，不是四个
 */
public class CountUniqueIsland {
	public int countUnique(int[][] islands){
		Set<String> set=new HashSet<String>();
		for(int i=0;i<islands.length;i++){
			for(int j=0;j<islands[0].length;j++){
				if(islands[i][j]==1){
					String s=convertToString(i,j,islands);
					set.add(s);
				}
			}
		}
		return set.size();
	}
	public String convertToString(int r,int c,int[][] islands){
		PriorityQueue<int[]> pq=new PriorityQueue<int[]>(new Comparator<int[]>(){
			public int compare(int[] i1,int[] i2){
				if(i1[0]==i2[0]){
					return i1[1]-i2[1];
				}
				return i1[0]-i2[0];
			}
		});
		addElement(r,c,islands,pq,r,c);
		StringBuilder sb=new StringBuilder();
		while(!pq.isEmpty()){
			int[] top=pq.poll();
			sb.append("["+top[0]+","+top[1]+"]");
		}
		return sb.toString();
	}
	public void addElement(int r,int c,int[][] islands,PriorityQueue<int[]> pq,int i,int j){
		int[] toadd={r-i,c-j};
		pq.offer(toadd);
		islands[r][c]=2;
		if(r-1>=0&&islands[r-1][c]==1){
			addElement(r-1,c,islands,pq,i,j);
		}
		if(r+1<islands.length&&islands[r+1][c]==1){
			addElement(r+1,c,islands,pq,i,j);
		}
		if(c-1>=0&&islands[r][c-1]==1){
			addElement(r,c-1,islands,pq,i,j);
		}
		if(c+1<islands[0].length&&islands[r][c+1]==1){
			addElement(r,c+1,islands,pq,i,j);
		}
	}
}

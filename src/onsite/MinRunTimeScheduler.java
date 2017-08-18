package onsite;
import java.util.*;

public class MinRunTimeScheduler {
	public String calSchedule(String tasks,int interval){
		StringBuilder sb=new StringBuilder();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<tasks.length();i++){
			char ch=tasks.charAt(i);		
			int last=map.containsKey(ch)?map.get(ch):0;
			while(sb.length()<last){
				sb.append('_');
			}
			sb.append(ch);
			map.put(ch, sb.length()+interval);
		}
		return sb.toString();
	}
	public String calScheduleWithConstantSpace(String tasks,int interval){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<tasks.length();i++){
			char ch=tasks.charAt(i);
			int dis=0;
			int index=sb.length()-1;
			while(index>=0&&sb.charAt(index)!=ch&&dis<interval){
				index--;
				dis++;
			}
			for(int j=0;j<interval-dis&&index!=-1;j++){
				sb.append('_');
			}
			sb.append(ch);
		}
		return sb.toString();
	}
}

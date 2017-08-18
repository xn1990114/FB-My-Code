package phone;
import java.util.*;
/*
 * 【题目】
两个input：
1）desired time range to arrange a meeting -- TimeRange desired_time 
2）a list of busy intervals -- List<TimeRange> busy_intervals

output: 
list of time ranges where a meeting can be scheduled, 会议没有时长限制 -- List<TimeRange>
 */
public class ArrangeMeeting {
	public class TimeRange {
	    double start;
	    double end;
	    public TimeRange(double s,double e){
	    	this.start=s;
	    	this.end=e;
	    }
	}
	public List<TimeRange> findFreeTimer(TimeRange desiredTime,List<TimeRange> busyIntervals){
		List<TimeRange> result=new ArrayList<TimeRange>();
		if(busyIntervals.size()==0){
			return result;
		}
		Collections.sort(busyIntervals,new Comparator<TimeRange>(){
			public int compare(TimeRange t1,TimeRange t2){
				if(t1.start==t2.start){
					return (int)(t1.end-t2.end);
				}
				return (int)(t1.start-t2.start);
			}
		});
		double lastEnd=desiredTime.start;
		for(int i=0;i<busyIntervals.size();i++){
			TimeRange curr=busyIntervals.get(i);
			if(curr.start<=lastEnd+0.01){
				lastEnd=Math.max(curr.end, lastEnd);
			}
			else{
				TimeRange temp=new TimeRange(Math.max(lastEnd,desiredTime.start),Math.min(curr.start,desiredTime.end));
				if(temp.start<temp.end-0.01){
					result.add(temp);
				}
				lastEnd=curr.end;
			}
		}
		if(lastEnd<desiredTime.end-0.01){
			result.add(new TimeRange(lastEnd,desiredTime.end));
		}
		return result;
	}
	public void display(List<TimeRange> list){
		for(TimeRange t:list){
			System.out.print(t.start+"->"+t.end+"\t");
		}
		System.out.println();
	}
}

package phone;
import java.util.*;
/*
 * given 2 list of interval representing users online offline timestamp e.g (already sorted), 
 * find all intervals that both of users are online.
e.g A= [(3, 5), (7, 11)] B=[(2, 4), (9, 10)] --> [(3, 4), (9, 10)].

 */
public class OverlapOfTwoIntervalList {
	public class Interval {
		int start;
		int end;

		public Interval(int start, int end) {
			this.start = start;
			this.end = end;
		}

		public boolean sameInterval(Interval i2) {
			return this.start == i2.start && this.end == i2.end;
		}

		public boolean hasOverlap(Interval i2) {
			return (this.start <= i2.end && this.start >= i2.start) 
					|| (this.end <= i2.end && this.end >= i2.start)
					|| (i2.start <= this.end && i2.start >= this.start)
					|| (i2.end <= this.end && i2.end >= this.start);
		}
	}

	public List<Interval> findOverlap(List<Interval> l1, List<Interval> l2) {
		List<Interval> res = new ArrayList<Interval>();
		int i1=0;
		int i2=0;
		while(i1<l1.size()&&i2<l2.size()){
			Interval int1=l1.get(i1);
			Interval int2=l2.get(i2);
			if(int1.hasOverlap(int2)){
				res.add(new Interval(Math.max(int1.start, int2.start),Math.min(int1.end,int2.end)));
			}
			if(int1.end<int2.end){
				i1++;
			}
			else{
				i2++;
			}
		}
		return res;
	}
}

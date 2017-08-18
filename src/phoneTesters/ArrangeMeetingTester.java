package phoneTesters;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;

import phone.ArrangeMeeting;
import phone.ArrangeMeeting.TimeRange;

public class ArrangeMeetingTester {

	@Test
	public void test() {
		ArrangeMeeting tester=new ArrangeMeeting();
		List<TimeRange> l1=new ArrayList<TimeRange>();
		TimeRange t11=tester.new TimeRange(9,14.5);
		TimeRange t12=tester.new TimeRange(8,10);
		TimeRange t13=tester.new TimeRange(9,12.5);
		TimeRange t14=tester.new TimeRange(14,15);
		l1.add(t12);l1.add(t13);l1.add(t14);
		List<TimeRange> r1=tester.findFreeTimer(t11,l1);
		tester.display(r1);
		List<TimeRange> l2=new ArrayList<TimeRange>();
		TimeRange t21=tester.new TimeRange(10,12);
		TimeRange t22=tester.new TimeRange(8,9);
		TimeRange t23=tester.new TimeRange(13,14);
		l2.add(t22);l2.add(t23);
		List<TimeRange> r2=tester.findFreeTimer(t21,l2);
		tester.display(r2);
		List<TimeRange> l3=new ArrayList<TimeRange>();
		TimeRange t31=tester.new TimeRange(7,16);
		TimeRange t32=tester.new TimeRange(8,10);
		TimeRange t33=tester.new TimeRange(9,12.5);
		TimeRange t34=tester.new TimeRange(14,15);
		l3.add(t32);l3.add(t33);l3.add(t34);
		List<TimeRange> r3=tester.findFreeTimer(t31,l3);
		tester.display(r3);
	}

}

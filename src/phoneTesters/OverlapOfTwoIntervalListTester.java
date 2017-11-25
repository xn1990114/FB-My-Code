package phoneTesters;
import java.util.*;

import static org.junit.Assert.*;

import org.junit.Test;

import phone.OverlapOfTwoIntervalList;
import phone.OverlapOfTwoIntervalList.Interval;

public class OverlapOfTwoIntervalListTester {

	@Test
	public void test() {
		OverlapOfTwoIntervalList tester=new OverlapOfTwoIntervalList();
		List<Interval> l11=new ArrayList<Interval>();
		List<Interval> l21=new ArrayList<Interval>();
		List<Interval> e1=new ArrayList<Interval>();
		l11.add(tester.new Interval(3,5));l11.add(tester.new Interval(7,11));
		l21.add(tester.new Interval(2,4));l21.add(tester.new Interval(9,10));
		e1.add(tester.new Interval(3,4));e1.add(tester.new Interval(9,10));
		List<Interval> r1=tester.findOverlap(l11, l21);
		assertTrue(r1.size()==e1.size());
		for(int i=0;i<r1.size();i++){
			assertTrue(r1.get(i).sameInterval(e1.get(i)));
		}
		
		List<Interval> l12=new ArrayList<Interval>();
		List<Interval> l22=new ArrayList<Interval>();
		List<Interval> e2=new ArrayList<Interval>();
		l12.add(tester.new Interval(1,5));l12.add(tester.new Interval(7,10));l12.add(tester.new Interval(20,24));
		l22.add(tester.new Interval(2,6));l22.add(tester.new Interval(8,24));
		e2.add(tester.new Interval(2,5));e2.add(tester.new Interval(8,10));e2.add(tester.new Interval(20,24));
		List<Interval> r2=tester.findOverlap(l12, l22);
		assertTrue(r2.size()==e2.size());
		for(int i=0;i<r2.size();i++){
			assertTrue(r2.get(i).sameInterval(e2.get(i)));
		}
		
		List<Interval> l13=new ArrayList<Interval>();
		List<Interval> l23=new ArrayList<Interval>();
		List<Interval> e3=new ArrayList<Interval>();
		l13.add(tester.new Interval(1,5));l13.add(tester.new Interval(7,10));l13.add(tester.new Interval(20,24));
		List<Interval> r3=tester.findOverlap(l13, l23);
		assertTrue(r3.size()==e3.size());
		for(int i=0;i<r3.size();i++){
			assertTrue(r3.get(i).sameInterval(e3.get(i)));
		}
		
		List<Interval> l14=new ArrayList<Interval>();
		List<Interval> l24=new ArrayList<Interval>();
		List<Interval> e4=new ArrayList<Interval>();
		l14.add(tester.new Interval(1,5));l14.add(tester.new Interval(7,10));l14.add(tester.new Interval(20,24));
		l24.add(tester.new Interval(0,1));l24.add(tester.new Interval(3,5));l24.add(tester.new Interval(7,10));
		l24.add(tester.new Interval(14,30));
		e4.add(tester.new Interval(1,1));e4.add(tester.new Interval(3,5));e4.add(tester.new Interval(7,10));
		e4.add(tester.new Interval(20,24));
		List<Interval> r4=tester.findOverlap(l14, l24);
		assertTrue(r4.size()==e4.size());
		for(int i=0;i<r4.size();i++){
			assertTrue(r4.get(i).sameInterval(e4.get(i)));
		}
	}

}

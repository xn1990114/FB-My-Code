package onsiteTester;

import java.util.*;


import org.junit.Test;

import onsite.MergeSet;

public class MergeSetTester {

	@Test
	public void test() {
		MergeSet tester=new MergeSet();
		List<Set<Integer>> sets1=new ArrayList<Set<Integer>>();
		Set<Integer> s1=new HashSet<Integer>();
		Set<Integer> s2=new HashSet<Integer>();
		Set<Integer> s3=new HashSet<Integer>();
		Set<Integer> s4=new HashSet<Integer>();
		Set<Integer> s5=new HashSet<Integer>();
		Set<Integer> s6=new HashSet<Integer>();
		Set<Integer> s7=new HashSet<Integer>();
		s1.add(1);s1.add(2);s2.add(2);s2.add(3);
		s3.add(3);s3.add(4);s4.add(5);s4.add(6);s4.add(7);
		s5.add(7);s5.add(8);s6.add(9);s7.add(9);
		sets1.add(s1);sets1.add(s2);sets1.add(s3);sets1.add(s4);sets1.add(s5);
		sets1.add(s6);sets1.add(s7);
		List<Set<Integer>> r1=tester.merge(sets1);
		for(Set<Integer> set:r1){
			for(int num:set){
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}

}

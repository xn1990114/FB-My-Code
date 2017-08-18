package onsiteTester;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import onsite.TwoNumSum;

public class TwoNumSumTester {

	@Test
	public void test() {
		TwoNumSum tns=new TwoNumSum();
		List<int[]> r1=tns.findPairs(24068);
		for(int[] a:r1){
			System.out.println(a[0]+"\t"+a[1]);
		}
		System.out.println();
		List<int[]> r2=tns.findPairs(12098);
		for(int[] a:r2){
			System.out.println(a[0]+"\t"+a[1]);
		}
		System.out.println();
		List<int[]> r3=tns.findPairs(1098);
		for(int[] a:r3){
			System.out.println(a[0]+"\t"+a[1]);
		}
		System.out.println();
		List<int[]> r4=tns.findPairs(888);
		for(int[] a:r4){
			System.out.println(a[0]+"\t"+a[1]);
		}
		System.out.println();
		List<int[]> r5=tns.findPairs(10998);
		for(int[] a:r5){
			System.out.println(a[0]+"\t"+a[1]);
		}
	}

}

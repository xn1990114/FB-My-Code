package phoneTesters;

import static org.junit.Assert.*;

import org.junit.Test;

import phone.OddEvenRearrange;

public class OddEvenRearrangeTester {

	@Test
	public void test() {
		OddEvenRearrange arranger=new OddEvenRearrange();
		int[] a1={1,2,3,4,5};
		arranger.rearrange(a1);
		for(int i=0;i<a1.length;i++){
			System.out.print(a1[i]+"\t");
		}
		System.out.println();
		int[] a2={1,3,3,4,5};
		arranger.rearrange(a2);
		for(int i=0;i<a1.length;i++){
			System.out.print(a2[i]+"\t");
		}
		System.out.println();
		int[] a3={1,2,3,3,5};
		arranger.rearrange(a3);
		for(int i=0;i<a1.length;i++){
			System.out.print(a3[i]+"\t");
		}
		System.out.println();
		int[] a4={1,2,3,3,5,-1};
		arranger.rearrange(a4);
		for(int i=0;i<a4.length;i++){
			System.out.print(a4[i]+"\t");
		}
		System.out.println();
		int[] a5={1,2,2,3,5,-1};
		arranger.rearrange(a5);
		for(int i=0;i<a5.length;i++){
			System.out.print(a5[i]+"\t");
		}
	}

}

package phoneTesters;

import static org.junit.Assert.*;

import org.junit.Test;

import phone.MoveZeroToBeginning;

public class MoveZeroToBeginningTester {

	@Test
	public void test() {
		int[] array1={0,4,6,2,0,7,1,7,0,3,65,4,90,0};
		MoveZeroToBeginning mztb=new MoveZeroToBeginning();
		assertTrue(mztb.moveZero(array1)==3);
		int[] array2={0,4,6,2,0,7,0,0,0};
		assertTrue(mztb.moveZero(array2)==3);
		int[] array3={0};
		assertTrue(mztb.moveZero(array3)==0);
		int[] array4={0,4,6,2,0,7,1,7,0,3,65,4,90,0};
		mztb.moveZero2(array4);
		for(int i=0;i<array4.length;i++){
			System.out.print(array4[i]+"\t");
		}
		System.out.println();
		int[] array5={0};
		mztb.moveZero2(array5);
		for(int i=0;i<array5.length;i++){
			System.out.print(array5[i]+"\t");
		}
		System.out.println();
		int[] array6={};
		mztb.moveZero2(array6);
		for(int i=0;i<array6.length;i++){
			System.out.print(array6[i]+"\t");
		}
	}

}

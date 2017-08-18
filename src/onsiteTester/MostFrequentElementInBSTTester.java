package onsiteTester;

import static org.junit.Assert.*;
/*
 * 							5  
 * 			3								10
 * 	  1			4						8		10
 * 		2			5				6	  9	  10(tc2)   10(tc2)
 * 								5			
 * 
 */

import org.junit.Test;

import onsite.MostFrequentElementInBST;
import onsite.MostFrequentElementInBST.Node;

public class MostFrequentElementInBSTTester {

	@Test
	public void test() {
		MostFrequentElementInBST checker=new MostFrequentElementInBST();
		Node n1=checker.new Node(1);Node n2=checker.new Node(2);Node n3=checker.new Node(3);
		Node n4=checker.new Node(4);Node n51=checker.new Node(5);Node n52=checker.new Node(5);
		Node n53=checker.new Node(5);Node n6=checker.new Node(6);Node n8=checker.new Node(8);Node n9=checker.new Node(9);
		Node n101=checker.new Node(10);Node n102=checker.new Node(10);
		Node n10tc21=checker.new Node(10);Node n10tc22=checker.new Node(10);
		n1.right=n2;n3.left=n1;n3.right=n4;n4.right=n51;n52.left=n3;n52.right=n101;
		n101.left=n8;n8.left=n6;n6.left=n53;n8.right=n9;n101.right=n102;
		int[] r1=checker.findMostFrequentElement(n52);
		assertTrue(r1[0]==5&&r1[1]==3);
		n102.left=n10tc21;n102.right=n10tc22;
		int[] r2=checker.findMostFrequentElement(n52);
		assertTrue(r2[0]==10&&r2[1]==4);
	}

}

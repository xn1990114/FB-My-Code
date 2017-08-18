package onsiteTester;

import static org.junit.Assert.*;

import org.junit.Test;

import onsite.BuildBSTFromPreorder;
import onsite.BuildBSTFromPreorder.Node;

public class BuildBSTFromPreorderTester {
/*
 * 								11
 * 				6									     20
 *        4        7                          15                 22
 *    2              8                  13          16
 *  1   3               9             12   14     17  18
 *   					  10
 * 
 * 
 * 
 */
	@Test
	public void test() {
		BuildBSTFromPreorder b=new BuildBSTFromPreorder();
		int[] values={11,6,5,2,1,3,7,8,9,10,20,15,13,12,14,16,17,18,22};
		BuildBSTFromPreorder.Node root=b.buildTree(values);
		StringBuilder sb=new StringBuilder();
		b.displayTree(root, sb);
		System.out.println(sb.toString());
	}

}

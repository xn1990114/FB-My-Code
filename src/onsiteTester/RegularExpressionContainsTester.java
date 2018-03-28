package onsiteTester;

import static org.junit.Assert.*;

import org.junit.Test;

import onsite.RegularExpressionContains;

public class RegularExpressionContainsTester {

	@Test
	public void test1() {
		RegularExpressionContains tester=new RegularExpressionContains();
		String src="awegrwweawef";
		String target="g*w";
		assertTrue(tester.isMatch(src, target));
	}
	@Test
	public void test2() {
		RegularExpressionContains tester=new RegularExpressionContains();
		String src="awegrwweawef";
		String target="gww*w";
		assertTrue(!tester.isMatch(src, target));
	}
	@Test
	public void test3() {
		RegularExpressionContains tester=new RegularExpressionContains();
		String src="asdgrwweawef";
		String target="g.w*wef";
		assertTrue(!tester.isMatch(src, target));
	}
	@Test
	public void test4() {
		RegularExpressionContains tester=new RegularExpressionContains();
		String src="asdgrwweawef";
		String target="g.*wef";
		assertTrue(tester.isMatch(src, target));
	}
	@Test
	public void test5() {
		RegularExpressionContains tester=new RegularExpressionContains();
		String src="asdgrwweawef";
		String target="g.*wec*f";
		assertTrue(tester.isMatch(src, target));
	}
	@Test
	public void test6() {
		RegularExpressionContains tester=new RegularExpressionContains();
		String src="asdgrwweawef";
		String target="a.*r";
		assertTrue(tester.isMatch(src, target));
	}
	@Test
	public void test7() {
		RegularExpressionContains tester=new RegularExpressionContains();
		String src="";
		String target="";
		assertTrue(tester.isMatch(src, target));
	}
	@Test
	public void test8() {
		RegularExpressionContains tester=new RegularExpressionContains();
		String src="asd";
		String target="";
		assertTrue(tester.isMatch(src, target));
	}
	@Test
	public void test9() {
		RegularExpressionContains tester=new RegularExpressionContains();
		String src="";
		String target="a";
		assertTrue(!tester.isMatch(src, target));
	}
	@Test
	public void test10() {
		RegularExpressionContains tester=new RegularExpressionContains();
		String src="";
		String target="a*.*s*";
		assertTrue(tester.isMatch(src, target));
	}
}

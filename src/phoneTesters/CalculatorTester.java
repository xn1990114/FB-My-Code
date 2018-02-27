package phoneTesters;

import static org.junit.Assert.*;

import org.junit.Test;

import phone.Calculator;

public class CalculatorTester {

	@Test
	public void test1() {
		Calculator tester=new Calculator();
		String s1="13*(1256*31-(33/2))-5/8+9";
		assertTrue(tester.calculateString(s1)==505969);
	}
	@Test
	public void test2() {
		Calculator tester=new Calculator();
		String s1="13*(-(1256*31)-(33/2))-5/8+9";
		assertTrue(tester.calculateString(s1)==-506367);
	}
	@Test
	public void test3() {
		Calculator tester=new Calculator();
		String s1="13*((1256*31)-(33/2))-5/8+9";
		assertTrue(tester.calculateString(s1)==505969);
	}
}

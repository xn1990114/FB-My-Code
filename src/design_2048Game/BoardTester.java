package design_2048Game;

import org.junit.Test;

public class BoardTester {

	@Test
	public void test() {
		Board b=new Board();
		b.initialize();
		b.display();
		b.update(1);
		b.display();
		b.update(2);
		b.display();
		b.update(3);
		b.display();
		b.update(0);
		b.display();
	}

}

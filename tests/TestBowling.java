import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test_spare_true() {
		Frame frame = new Frame(6,4);
		
		boolean result = true;
		
		assertEquals(result, frame.isSpare());
	}

}

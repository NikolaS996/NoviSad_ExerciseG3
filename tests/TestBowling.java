import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test_spare() {
		Frame frame = new Frame(6,4);
		
		boolean result = true;
		
		asserEquals(result, frame.isSpare());
	}

}

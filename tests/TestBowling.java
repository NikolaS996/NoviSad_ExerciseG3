import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test_spare_true() throws BowlingException{
		Frame frame = new Frame(6,4);
		
		boolean result = true;
		
		assertEquals(result, frame.isSpare());
	}
	
	@Test
	public void test_spare_false() throws BowlingException{
		Frame frame = new Frame(3,5);
		
		boolean result = false;
		
		assertEquals(result, frame.isSpare());
	}
	
	@Test
	public void test_spare() throws BowlingException{
		Frame frame = new Frame(3,9);
		
	}
	
	@Test
	public void test_strike_true() throws BowlingException{
		Frame frame = new Frame(10, 0);
		
		boolean result = true;
		
		assertEquals(result, frame.isStrike());
	}
	
	@Test
	public void test_strike_false() throws BowlingException{
		Frame frame = new Frame(8, 2);
		
		boolean result = false;
		
		assertEquals(result, frame.isStrike());
	}
	
	@Test
	public void test_strike() throws BowlingException{
		Frame frame = new Frame(8, 3);
		
	}
	
	@Test
	public void test_score() throws BowlingException{
		Frame frame = new Frame(5, 3);
		
		int score = 8;
		
		assertEquals(score, frame.score());
	}
	
	@Test
	public void test_invalid_frame() throws BowlingException{
		Frame frame = new Frame(5, 6);
		
	}

}

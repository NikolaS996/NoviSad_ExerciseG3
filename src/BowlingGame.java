import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int finalScore;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame) throws BowlingException{
		if(frames.size() < 10)
			frames.add(frame);
		else
			throw new BowlingException();
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		bonus.setFirstThrow(firstThrow);
		bonus.setSecondThrow(secondThrow);
	}
	
	// Returns the game score
	public int score() throws BowlingException{
		
		Frame tmp = new Frame(0,0);
		
		for(int i = 0 ; i < frames.size() ; i++){
			
			finalScore = finalScore + frames.get(i).score();
			
			if(tmp.isStrike())
				this.setBonus(frames.get(i).getFirstThrow(),frames.get(i).getSecondThrow());
			else if(tmp.isSpare())
				this.setBonus(frames.get(i).getFirstThrow(), 0);
			
			finalScore = finalScore + bonus.score();
			
			this.setBonus(0, 0);
			tmp = frames.get(i);
		}
		
		return finalScore;
	}

	public Frame getBonus() {
		return bonus;
	}

	public void setBonus(Frame bonus) {
		this.bonus = bonus;
	}
}

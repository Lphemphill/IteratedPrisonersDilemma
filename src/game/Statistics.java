package game;
/**
 * Begins by staying silent against its opponent, then mimics its last response
 * @author lphemphill
 * 8/4/15
 */
public class Statistics implements Player{

	private int opponentResponse;
	private int roundNum;
	private final int[] testOpponent = {0, 1, 0};
	private int[] storedResponses;
	private boolean retaliated;
	
	public Statistics(){
		opponentResponse = -1;
		roundNum = 0;
		storedResponses = new int[150];
		retaliated = false;
		
	}
	public int play() {
		//On the first 3 rounds, play silent, betray, silent to record opponent response
		if(roundNum < 3){
			return testOpponent[roundNum];
		} else {
			if(storedResponses[2] == 1){
				retaliated = true;
			}
		}
		return 0;
	}

	public String name() {
		return "Statistics";
	}

	public void receiveLastResponse(int opponentAnswer) {
		storedResponses[roundNum] = opponentAnswer;
		roundNum++;
	}
	public Player createNew(){return new Statistics();}

}

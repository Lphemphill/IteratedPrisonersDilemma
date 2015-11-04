package game;
/**
 * An interface for creating new Players for a game of Iterated Prisoner's Dilemma
 * @author lphemphill
 * 7/31/15
 */
public interface Player {
	/**
	 * A game of PD has started, returns 0 to stay silent or 1 to betray
	 * @return int Response for this game
	 */
	public int play();
	/**
	 * The name of the player
	 * @return name Your player's name
	 */
	public String name();
	/**
	 * The player is given the last response of its opponent, and can choose to use the info to inform future decisions
	 * @param opponentAnswer The last answer your opponent gave
	 */
	public void receiveLastResponse(int opponentAnswer);
	/**
	 * The player is about to play against a new opponent and must be reinstantiated; return a new copy of the same player
	 */
	public Player createNew();
}

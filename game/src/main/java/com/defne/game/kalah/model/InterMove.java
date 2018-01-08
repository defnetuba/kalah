package com.defne.game.kalah.model;

import java.time.LocalDateTime;
/**
 * 
 * @author DFB
 * @version 0.1
 * @deprecated not used anymore since model is build upon dynamodb no need relational logic.
 *  
 */
public interface InterMove {

	public String getId();
	public void setId(String id);
	
	public String getCurrentPlayerId();
	public void setCurrentPlayerId(String currentPlayerId);
	
	public String getNextPlayerId();
	public void setNextPlayerId(String nextPlayerId);
	
	public String getMatchId();
	public void setMatchId(String id);
	
	public InterBoard getCurrentBoard();
	public void setCurrentBoard(InterBoard board);
	
	public String getCurrentScore();
	public void setCurrentScore(String currentScore);
	
	public String getCurrentStatus();
	public void setCurrentStatus(String currentStatus);
	
    public LocalDateTime getCreated();
	public void setCreated(LocalDateTime created);

}

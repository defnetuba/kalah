package com.defne.game.kalah.model;

import java.util.ArrayList;

import java.time.LocalDateTime;
/**
 * 
 * @author DFB
 * @summary used for each game record for dynamodb in phase to extend this class for dynamo
 * @version 0.1
 *
 */

public class Match implements InterMatch {

	private String id;
	private String status; //pause,ongoing,end
	private Player nextPlayer;
	private String matchType;// todo: use for tournament maybe
	private Player playerNorth;
	private Player playerSouth;
	private Integer scoreNorth;
	private Integer scoreSouth;
	private ArrayList<KalahMove> moveHistory;// moves (kept as json in dynamodb)
	private LocalDateTime matchStart;
	private LocalDateTime matchEnd;

	public Match() {

	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public LocalDateTime getMatchStart() {
		return matchStart;
	}

	public void setMatchStart(LocalDateTime matchStart) {
		this.matchStart = matchStart;
	}


	public LocalDateTime getMatchEnd() {
		return matchEnd;
	}

	public void setMatchEnd(LocalDateTime matchEnd) {
		this.matchEnd = matchEnd;
	}

	public Player getPlayerNorth() {
		return playerNorth;
	}

	public void setPlayerNorth(Player playerNorth) {
		this.playerNorth = playerNorth;
	}

	public Player getPlayerSouth() {
		return playerSouth;
	}

	public void setPlayerSouth(Player playerSouth) {
		this.playerSouth = playerSouth;
	}

	public Player getNextPlayer() {
		return nextPlayer;
	}

	public void setNextPlayer(Player nextPlayer) {
		this.nextPlayer = nextPlayer;
	}
	
	public ArrayList<KalahMove> getMoveHistory() {
		return moveHistory;
	}

	public void setMoveHistory(ArrayList<KalahMove> moveHistory) {
		this.moveHistory = moveHistory;
	}

	public Integer getScoreSouth() {
		return scoreSouth;
	}

	public void setScoreSouth(Integer scoreSouth) {
		this.scoreSouth = scoreSouth;
	}

	public Integer getScoreNorth() {
		return scoreNorth;
	}

	public void setScoreNorth(Integer scoreNorth) {
		this.scoreNorth = scoreNorth;
	}

	
}

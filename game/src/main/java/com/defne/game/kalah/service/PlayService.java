package com.defne.game.kalah.service;

import java.time.LocalDateTime;

import com.defne.game.kalah.model.KalahBoard;
import com.defne.game.kalah.model.KalahBoardStep;
import com.defne.game.kalah.model.KalahMove;
import com.defne.game.kalah.model.Match;
import com.defne.game.kalah.model.Player;

public class PlayService {
	
	 
	 private KalahMove game;
	 private Match match;

	    public PlayService() {
	       
	    }
	    
	    public void initiateGame(Player playerSouth) {
	    	
	    	this.match.setMatchStart(LocalDateTime.now());
	    	this.match.setMatchType("regular");
	    	this.match.setNextPlayer(playerSouth);
	    	this.match.setPlayerSouth(playerSouth);
	    	this.match.setScoreNorth(0);
	    	this.match.setScoreSouth(0);
	    	this.match.setStatus("connecting");

	    }
	    
	    public void connectGame(Player playerNorth) {
	    	
	    	this.match.setMatchStart(LocalDateTime.now());
	    	this.match.setPlayerNorth(playerNorth);
	    	this.match.setStatus("connected");
	    }
	    /**
	     * 
	     * @param currentMatch
	     * @param currentGame
	     * @summary call to move and update objects
	     */
		public void moveSeed(Match currentMatch,KalahMove currentGame) {
					
			KalahBoard currentBoard=currentGame.getBoard();//currrent board to be updated now
			KalahBoardStep currentPitToBeMoved=currentGame.getMovedStep();//selected pit to be moved
			Integer currentSeedsToBeMoved=currentPitToBeMoved.getSeedCount();

						
			Integer currentPitId=currentPitToBeMoved.getId();
			
			currentBoard.getSteps().get(currentPitId).setSeedCount(0);
			
			for (Integer pitId=currentPitId+1;pitId<=currentPitId+currentSeedsToBeMoved;pitId++) {
				
				currentBoard.getSteps().get(pitId).incSeedCount();
				if(currentBoard.getSteps().get(pitId).getType()==KalahBoardStep.stepTypes.NORTH_HOUSE) {
					currentMatch.setScoreNorth(currentBoard.getSteps().get(pitId).getSeedCount());
					
				}else if(currentBoard.getSteps().get(pitId).getType()==KalahBoardStep.stepTypes.SOUTH_HOUSE) {
					currentMatch.setScoreSouth(currentBoard.getSteps().get(pitId).getSeedCount());
				}
				
			}
			
			currentGame.setPlayerCurrent(currentMatch.getNextPlayer());
			
			if(currentMatch.getNextPlayer()==currentMatch.getPlayerNorth()) {
				
				currentMatch.setNextPlayer(currentMatch.getPlayerSouth());//updated new next player
			}
				
			else {
				currentMatch.setNextPlayer(currentMatch.getPlayerNorth());
			}
			
			currentGame.setBoard(currentBoard);
			currentGame.setMoveDT(LocalDateTime.now());
			currentMatch.getMoveHistory().add(currentGame);
			currentMatch.setStatus("playing");

			this.game=currentGame;
			this.match=currentMatch;
			
			
			//todo: call updates on db also

		}


		public KalahMove getGame() {
			return game;
		}

		public void setGame(KalahMove game) {
			this.game = game;
		}

		public Match getMatch() {
			return match;
		}

		public void setMatch(Match match) {
			this.match = match;
		}
		
		
		
		
	    
}

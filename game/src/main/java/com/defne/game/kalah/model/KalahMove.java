package com.defne.game.kalah.model;

import java.time.LocalDateTime;

/**
 * 
 * @author DFB on 06.01.2017
 *
 */
public class KalahMove {
	private Player playerCurrent;// moving player **mandatory
	private KalahBoardStep movedStep;// moved step **mandatory
	private KalahBoard board;// updated new board
	private LocalDateTime moveDT;// moving datetime --sort descending **mandatory

	public Player getPlayerCurrent() {
		return playerCurrent;
	}

	public void setPlayerCurrent(Player playerCurrent) {
		this.playerCurrent = playerCurrent;
	}

	public KalahBoardStep getMovedStep() {
		return movedStep;
	}

	public void setMovedStep(KalahBoardStep movedStep) {
		this.movedStep = movedStep;
	}

	public KalahBoard getBoard() {
		return board;
	}

	public void setBoard(KalahBoard board) {
		this.board = board;
	}

	public LocalDateTime getMoveDT() {
		return moveDT;
	}

	public void setMoveDT(LocalDateTime moveDT) {
		this.moveDT = moveDT;
	}

}

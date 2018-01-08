package com.defne.game.kalah.model;

import java.util.ArrayList;

/**
 * 
 * @author DFB
 * @summary a board includes several steps/characters 
 */
public interface InterBoard {

	public ArrayList<? extends InterBoardStep> getBoard();
	public void setBoard(ArrayList<? extends InterBoardStep> steps);
	
	
}

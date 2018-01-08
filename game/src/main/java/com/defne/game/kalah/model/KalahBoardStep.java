package com.defne.game.kalah.model;

public class KalahBoardStep implements InterBoardStep{

	private Integer id;
	private stepTypes type;
	private Integer seedCount; //kalah,mancala.. board special 
	
	public enum stepTypes {
	    NORTH_HOUSE,
	    SOUTH_HOUSE,
	    PIT
	}
	
	   public KalahBoardStep(Integer id,stepTypes TYPE, Integer seedCount) {
	        this.id = id;
	        this.type = TYPE;
	        this.seedCount = seedCount;
	    }
	
/**
 * each step has an id will be determined during board setup
 */
	public void setId(Integer id) {
		this.id = id;
	}
/**
 * types can be pit, house
 */
	public void setType(stepTypes type) {
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public stepTypes getType() {
		return this.type;
	}
	
	public Integer getSeedCount() {
		return seedCount;
	}
	
	public void setSeedCount(Integer seedCount) {
		this.seedCount = seedCount;
	}
	
	public void incSeedCount() {
		this.seedCount = this.seedCount+1;
	}


}

package com.defne.game.kalah.model;

import java.util.ArrayList;


public class KalahBoard implements InterBoard{

	private ArrayList<KalahBoardStep> steps;
	
	/**
	 * initial board setup 6,6
	 * @param pits
	 * @param seedCount
	 */
	   public KalahBoard(Integer pits,Integer seedCount) {

		   //TODO: find a better logic to define these pits and seeds!
		   
		   for(int i=1;i<=pits;i++) {
			   KalahBoardStep step=new KalahBoardStep(i,KalahBoardStep.stepTypes.PIT,seedCount);
			   this.steps.add(step);
		   }
		   
		   KalahBoardStep step2=new KalahBoardStep(pits+1,KalahBoardStep.stepTypes.SOUTH_HOUSE,0);
		   this.steps.add(step2);
		   
		   for(int i=pits+2;i<=(pits*2)+1;i++) {
			   KalahBoardStep step3=new KalahBoardStep(i,KalahBoardStep.stepTypes.PIT,seedCount);
			   this.steps.add(step3);
		   }
		   
		   KalahBoardStep step4=new KalahBoardStep((pits*2)+2,KalahBoardStep.stepTypes.NORTH_HOUSE,0);
		   this.steps.add(step4);
		   
	    }


	public ArrayList<KalahBoardStep> getBoard() {
		return steps;
	}

	@SuppressWarnings("unchecked")
	public void setBoard(ArrayList<? extends InterBoardStep> steps) {
		this.steps=(ArrayList<KalahBoardStep>) steps;
	}
	

	public void setBoardStepByPit(Integer pit,Integer seedCount) {
		this.steps.get(pit).setSeedCount(seedCount);
	}


	public ArrayList<KalahBoardStep> getSteps() {
		return steps;
	}


	public void setSteps(ArrayList<KalahBoardStep> steps) {
		this.steps = steps;
	}

	public Integer getSeedCountByPitId(Integer pitId) {
		return steps.get(pitId).getSeedCount();
	}
	
	public void setSeedCountByPitId(Integer pitId,Integer seedCount) {
		 steps.get(pitId).setSeedCount(seedCount);
	}

	
//TODO: return house north , return house south , winning house 
	
	
}

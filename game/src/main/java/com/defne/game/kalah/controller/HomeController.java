package com.defne.game.kalah.controller;


import com.defne.game.kalah.model.KalahMove;
import com.defne.game.kalah.model.Match;
import com.defne.game.kalah.model.Player;
import com.defne.game.kalah.service.PlayService;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	    private SimpMessagingTemplate template;
	    private PlayService play;
 
	 
	    @RequestMapping(value = "/")
	    public String home(){
	  	    /*	Player playerSouth=new Player();
	    	playerSouth.setUsername("playerSouth");
	    	play.initiateGame(playerSouth);
	    	*/
	        return "home";
	        
	    }

	    
	    @MessageMapping("/game")
		@SendTo("/kalah/moves")
	    public PlayService move(Match match,KalahMove move) throws Exception {
	    	PlayService play=new PlayService();
	    	play.moveSeed(match,move);
	        return play;
	        
	    }
	 
}

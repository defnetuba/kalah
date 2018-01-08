package com.defne.game.kalah.model;

import java.time.LocalDateTime;

/**
 * 
 * @author DFB on 07.01.2017
 * @summary dynamodb connection is phase 2 can be extended from this class
 *
 */

public class Player implements InterPlayer{

	private String id;
    private String username;
    private String email;
    private String pass;
    private LocalDateTime created;

    public Player() {

    }



    public Player(String email, String username) {

        this.username = username;
        this.email = email;

    }




    public String getId() {

        return id;

    }

  	public String getPass() {
  		return pass;
  	}


    public String getUsername() {

        return username;

    }


    public String getEmail() {

        return email;

    }


    public LocalDateTime getCreated() {
        return created;

    }

    public void setId(String id) {

        this.id = id;

    }


  	public void setPass(String pass) {
  	     this.pass = pass;
  		
  	}

    public void setUsername(String username) {

        this.username = username;

    }

    public void setEmail(String email) {

        this.email = email;

    }
    
    public void setCreated(LocalDateTime created) {

        this.created = created;

    }


}




	
	
	


package com.defne.game.kalah.model;
import java.time.LocalDateTime;

/**
 * 
 * @author DFB
 * @summary interface used for authentication and user types. 
 * @version 0.1 
 */
public interface InterUser {

	   	public void setId(String id);
	   	public void setPass(String pass);
	    public void setUsername(String username);
	    public void setEmail(String email);
	 	public String getUsername();
	    public String getEmail();
	    public String getId();
	    public String getPass();
	    public LocalDateTime getCreated();
		public void setCreated(LocalDateTime created);
	 
}

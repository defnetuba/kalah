package com.defne.game.kalah.model;


public interface InterPlayer extends InterUser{

	    public String getId();
	  	public String getPass();
	    public String getUsername();
	    public String getEmail();

	    public void setId(String id);
	  	public void setPass(String pass);
	    public void setUsername(String username);
	    public void setEmail(String email);

}

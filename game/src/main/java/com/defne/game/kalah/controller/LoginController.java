package com.defne.game.kalah.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @author DFB
 * @deprecated
 * login and data saving of the game will be phase 2
 */
@Controller
public class LoginController {

    
    // Login form
    @RequestMapping("/login.html")
    public String login() {
      return "login.html";
    }

    // Login form with error
    @RequestMapping("/login-error.html")
    public String loginError() {
      //model.addAttribute("loginError", true);
      return "login.html";
    }

	
	
}

package com.defne.game.kalah.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * @author DFB on 6/1/18.
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer  {

	

	public void configureMessageBroker(MessageBrokerRegistry confi) {

		confi.enableSimpleBroker("/play");
		confi.setApplicationDestinationPrefixes("/app");

	}



	public void registerStompEndpoints(StompEndpointRegistry registry) {

		registry.addEndpoint("/kalah-playing").withSockJS();

		

	}



}
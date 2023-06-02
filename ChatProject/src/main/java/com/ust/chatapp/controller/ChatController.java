package com.ust.chatapp.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.ust.chatapp.message.ChatMessage;

@Controller
public class ChatController {

	    @MessageMapping("/message") // Handle messages sent to "/message" endpoint
	    @SendTo("/topic/chat") // Broadcast the message to clients subscribed to "/topic/chat"
	    public ChatMessage broadcastMessage(ChatMessage message) {
	        return message;
	    }
}




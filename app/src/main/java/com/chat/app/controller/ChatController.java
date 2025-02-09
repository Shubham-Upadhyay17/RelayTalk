package com.chat.app.controller;

import com.chat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage") // When a message is sent from the frontend
    @SendTo("/topic/messages") // Broadcasts to all subscribers
    public ChatMessage sendMessage(ChatMessage message) {
        message.setTimestamp(new SimpleDateFormat("HH:mm:ss").format(new Date()));
        return message;
    }

    @MessageMapping("/join")
    @SendTo("/topic/messages")
    public ChatMessage joinUser(ChatMessage message) {
        message.setContent("joined the chat!");
        message.setTimestamp(new SimpleDateFormat("HH:mm:ss").format(new Date()));
        return message;
    }
    @GetMapping("/chat")
    public String chatPage() {
        return "chat"; // Serves chat.html from templates/
    }
}

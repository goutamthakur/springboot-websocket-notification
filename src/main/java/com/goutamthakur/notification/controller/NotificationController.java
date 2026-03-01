package com.goutamthakur.notification.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {

    // groups can be created using /topic/notifications/{groupId}
    // client will subscribe to /topic/notifications/{groupId}

    @MessageMapping("/sendMessage")
    @SendTo("/topic/notifications")
    public String sendMessage(String message){
        return message;
    }

}

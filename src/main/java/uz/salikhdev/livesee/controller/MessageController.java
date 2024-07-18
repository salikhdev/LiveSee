package uz.salikhdev.livesee.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class MessageController {

    @MessageMapping("/stream")
    @SendTo("/topic/stream")
    public String handleStream(String message) {
        return HtmlUtils.htmlEscape(message);
    }
}
